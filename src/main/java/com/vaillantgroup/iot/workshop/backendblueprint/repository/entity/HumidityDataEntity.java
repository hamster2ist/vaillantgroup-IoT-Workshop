package com.vaillantgroup.iot.workshop.backendblueprint.repository.entity;


import com.vaillantgroup.iot.workshop.backendblueprint.model.DeviceMetadataDTO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;

@Data
@Document(collection = "humidity-data")
public class HumidityDataEntity {

    private String deviceId;

    private double humidityValue;

    private DeviceMetadataDTO deviceMetadata;

    private OffsetDateTime receivedAt;

    private OffsetDateTime updatedAt;

    private OffsetDateTime createdAt;

}


