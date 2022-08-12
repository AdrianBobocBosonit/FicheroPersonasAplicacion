package com.bosonit.FicheroPersonas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/a")
    public String getHolaA() {
        return "Hola Mundo A";
    }

    @GetMapping("/b")
    public String getHolaB() {
        return "Hola Mundo B";
    }
}
