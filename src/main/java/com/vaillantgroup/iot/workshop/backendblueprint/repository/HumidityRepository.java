package com.vaillantgroup.iot.workshop.backendblueprint.repository;

import com.vaillantgroup.iot.workshop.backendblueprint.controller.model.HumidityDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HumidityRepository extends MongoRepository<HumidityDTO, String> {
}
