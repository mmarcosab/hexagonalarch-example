package com.hexagonalarch.app.infrastructure.configuration;

import com.hexagonalarch.app.infrastructure.repository.SpringDataAnimalRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = SpringDataAnimalRepository.class)
public class MySqlDbConfiguration {

}
