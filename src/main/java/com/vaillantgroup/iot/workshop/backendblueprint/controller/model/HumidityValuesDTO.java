package com.vaillantgroup.iot.workshop.backendblueprint.controller.model;

import com.vaillantgroup.iot.workshop.backendblueprint.model.DeviceMetadataDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class HumidityValuesDTO {

    private String deviceId;

    private List<Double> humidityValues;

    private DeviceMetadataDTO deviceMetadata;

}
