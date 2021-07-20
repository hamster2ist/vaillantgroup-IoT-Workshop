package com.vaillantgroup.iot.workshop.backendblueprint.controller;


import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityDTO;
import com.vaillantgroup.iot.workshop.backendblueprint.controller.service.HumidityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.baseurl}/sensor/data")
@RequiredArgsConstructor
public class HelloWorldController {

    private final HumidityService humidityService;

    @PostMapping("/humidity")
    public HumidityDTO postHumidityData(@RequestBody HumidityDTO humidityDTO) {
        return humidityDTO;
    }

    @GetMapping("/humidity")
    public List<HumidityDTO> fetchALLHumidityData() {
        return humidityService.getAllHumidityData();
    }

}
