package com.vaillantgroup.iot.workshop.backendblueprint.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HumidityDTO {

    private String deviceId;

    private double humidityValue;

    @JsonProperty("deviceMetadata")
    private DeviceMetadataDTO deviceMetadata;

}
