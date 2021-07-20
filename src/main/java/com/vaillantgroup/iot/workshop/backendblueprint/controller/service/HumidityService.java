package com.vaillantgroup.iot.workshop.backendblueprint.controller.service;

import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.repository.HumidityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class HumidityService {

    private final HumidityRepository humidityRepository;

    public List<HumidityDTO> getAllHumidityData(){
        return humidityRepository.findAll();
    }
}
