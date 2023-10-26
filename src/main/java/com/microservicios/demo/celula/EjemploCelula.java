package com.microservicios.demo.celula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploCelula {

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola Mundo Alejandro";
    }
}

