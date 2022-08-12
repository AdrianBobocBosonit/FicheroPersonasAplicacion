package com.bosonit.FicheroPersonas;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    /*@GetMapping("/a")
    public String getHolaA() {
        return "Hola Mundo A";
    }

    @GetMapping("/b")
    public String getHolaB() {
        return "Hola Mundo B";
    }*/

    @GetMapping("/user/{nombre}")
    public String saludo(@PathVariable String nombre) {
        return nombre.isEmpty()?"Hola mundo":"Hola " + nombre;
    }

    @PostMapping("/useradd")
    public Persona addUser(@RequestBody Persona persona) {
        return persona;
    }
}
