package com.backend.springboot.app.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.backend.springboot.app.commons.beneficiarios.models.entity"})
public class AyllusinchiServicioEstudianteApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyllusinchiServicioEstudianteApplication.class, args);
    }

}
