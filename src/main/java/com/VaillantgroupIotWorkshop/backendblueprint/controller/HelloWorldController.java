package com.VaillantgroupIotWorkshop.backendblueprint.controller;


import com.VaillantgroupIotWorkshop.backendblueprint.controller.model.HumidityDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.baseurl}/sensor/data")
public class HelloWorldController {


    @PostMapping("/humidity")
    public HumidityDTO postHumidityData(@RequestBody HumidityDTO humidityDTO){


        return humidityDTO;

    }
}
