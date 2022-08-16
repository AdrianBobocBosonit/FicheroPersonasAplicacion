package com.bosonit.FicheroPersonas;

import lombok.Data;

@Data
public class Persona {
        //Cuidado, no es lo mismo "Name" que "name" a la hora de pasar el parametro
    private String name;
    private int edad;
    private String ciudad;

        //Antes habían unos get de las 3 propiedades para ver si me llegaba algun nulo en el metodo del controller "addUser", pero han sido removidos debido a la instalacion del plugin Lombok
}
