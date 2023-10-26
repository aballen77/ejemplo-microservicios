package com.microservicios.demo.celula;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploCelula {

    public static void main(String[] args) {
        SpringApplication.run(EjemploCelula.class, args);
        System.out.println(SpringApplication.run(EjemploCelula.class, args));


        SpringApplication.run(EjemploCelula.class, args);



    }
}

