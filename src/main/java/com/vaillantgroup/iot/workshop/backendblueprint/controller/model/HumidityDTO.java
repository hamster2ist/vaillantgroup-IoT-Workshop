package com.vaillantgroup.iot.workshop.backendblueprint.controller.model;

import com.vaillantgroup.iot.workshop.backendblueprint.model.DeviceMetadataDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HumidityDTO {

    private String deviceId;

    private double humidityValue;


    private DeviceMetadataDTO deviceMetadata;

}
