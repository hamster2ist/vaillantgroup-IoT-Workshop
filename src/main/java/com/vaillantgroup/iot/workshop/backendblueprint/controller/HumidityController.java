package com.vaillantgroup.iot.workshop.backendblueprint.controller;


import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityValuesDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.service.HumidityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${api.baseurl}/sensor/data")
@RequiredArgsConstructor
public class HumidityController {

    private final HumidityService humidityService;

    @PostMapping("/humidity")
    @ResponseStatus(HttpStatus.CREATED)
    public void postHumidityData(@RequestBody HumidityDTO humidityDTO) {
        humidityService.saveHumidityData(humidityDTO);
    }

    @GetMapping("/humidity")
    public HumidityValuesDTO fetchALLHumidityData(@RequestParam Optional<String> deviceId) {
        return humidityService.getAllHumidityDataByDeviceId(deviceId);
    }



}
