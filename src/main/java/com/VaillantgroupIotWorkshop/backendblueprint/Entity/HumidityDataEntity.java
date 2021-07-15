package com.VaillantgroupIotWorkshop.backendblueprint.Entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class HumidityDataEntity {

    @Id
    private String id;

    private String humidity;

}


