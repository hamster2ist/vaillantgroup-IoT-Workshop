package com.VaillantgroupIotWorkshop.backendblueprint.controller.model;

import lombok.Data;
@Data
public class HumidityDTO {


    private String deviceId;

    private double humidityValue;

    private DeviceMetadataDTO deviceMetadata;

}
