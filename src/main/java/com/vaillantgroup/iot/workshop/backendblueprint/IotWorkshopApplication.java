package com.vaillantgroup.iot.workshop.backendblueprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotWorkshopApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(HumidityRepository repository){

		return args -> {
			DeviceMetadataDTO deviceMetadataDTO = new DeviceMetadataDTO("Test");
			HumidityDTO humidityDTO = new HumidityDTO(
					10,
					deviceMetadataDTO
			);

			repository.insert(humidityDTO);
		};
	}*/

}

