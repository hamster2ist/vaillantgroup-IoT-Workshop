package com.vaillantgroup.iot.workshop.backendblueprint.service;

import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityValuesDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.repository.HumidityRepository;
import com.vaillantgroup.iot.workshop.backendblueprint.repository.entity.HumidityDataEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class HumidityService {

    private final HumidityRepository humidityRepository;

    public HumidityValuesDTO getAllHumidityDataByDeviceId(Optional<String> optionalDeviceId) {
        if (optionalDeviceId.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Query Parameter DeviceId is required");
        }

        String deviceId = optionalDeviceId.get();
        List<HumidityDataEntity> humidityDataEntities = humidityRepository.findByDeviceId(deviceId);

        return HumidityValuesDTO.builder()
                .humidityValues(getHumidityValues(humidityDataEntities))
                .deviceId(deviceId)
                .deviceMetadata(humidityDataEntities.get(0).getDeviceMetadata())
                .build();
    }

    private List<Double> getHumidityValues(List<HumidityDataEntity> humidityDataEntities) {
        List<Double> humidityValues = new ArrayList<>();

        for (int i = 0; i < humidityDataEntities.size(); i++) {
            humidityValues.add(humidityDataEntities.get(i).getHumidityValue());
        }
        return humidityValues;
    }

    public void saveHumidityData(HumidityDTO humidityDTO) {

        HumidityDataEntity humidityDataEntity = new HumidityDataEntity();

        humidityDataEntity.setHumidityValue(humidityDTO.getHumidityValue());
        humidityDataEntity.setDeviceId(humidityDTO.getDeviceId());
        humidityDataEntity.setDeviceMetadata(humidityDTO.getDeviceMetadata());
        humidityDataEntity.setCreatedAt(OffsetDateTime.now());


        Optional<String> optionalDeviceId = Optional.ofNullable(humidityDTO.getDeviceId()) ;
        HumidityValuesDTO humidityValuesDTO = getAllHumidityDataByDeviceId(optionalDeviceId);
        double avgHumidityValue;

        if (humidityValuesDTO.getHumidityValues().size() % 60 == 0){
            avgHumidityValue = getAvgHumidityValue(humidityValuesDTO);
        }

        humidityRepository.insert(humidityDataEntity);
    }

    public double getAvgHumidityValue(HumidityValuesDTO humidityValuesDTO){
        double average = 0.0;

        for (int i=0; i < 60; i++){
            average = average + humidityValuesDTO.getHumidityValues().get(humidityValuesDTO.getHumidityValues().size() - i);
        }

        return average;
    }
}
