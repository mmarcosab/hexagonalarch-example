package com.hexagonalarch.app.infrastructure.configuration;

import com.hexagonalarch.app.domain.repository.AnimalRepository;
import com.hexagonalarch.app.domain.service.AnimalService;
import com.hexagonalarch.app.domain.service.DomainAnimalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public AnimalService animalService(AnimalRepository animalRepository) {
        return new DomainAnimalService(animalRepository);
    }

}
