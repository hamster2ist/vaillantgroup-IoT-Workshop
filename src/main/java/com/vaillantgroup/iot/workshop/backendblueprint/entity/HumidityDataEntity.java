package com.vaillantgroup.iot.workshop.backendblueprint.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "humidity-data")
public class HumidityDataEntity {

    @Id
    private String id;

    private String humidity;

}


