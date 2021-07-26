package com.vaillantgroup.iot.workshop.backendblueprint.repository;

import com.vaillantgroup.iot.workshop.backendblueprint.repository.entity.HumidityDataEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HumidityRepository extends MongoRepository<HumidityDataEntity, String> {
    List<HumidityDataEntity> findByDeviceId(String deviceId);


}
