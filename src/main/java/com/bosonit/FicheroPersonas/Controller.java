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

    @GetMapping("/user")
    public String saludo2() {
        return "Hola Mundo";
    }

    @PostMapping("/useradd")
    public Persona addUser(@RequestBody Persona persona) {
        System.out.println(persona.getName());
        System.out.println(persona.getEdad());
        System.out.println(persona.getCiudad());
        return persona;
    }

}
