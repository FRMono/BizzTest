package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stand {
    String NombreStand;


    public Stand(String NombreStand) {
        this.NombreStand = NombreStand;
    }
    public static Stand crearStandF(){
        String nombre = "Moody Reds";

        return new Stand(nombre);
    }
    public static Stand crearStandA(){
        String nombre = "Surfer's Highway";
        return new Stand(nombre);
    }

    public static Stand crearStandP(){
        String nombre = "Oogie's Way";
        return new Stand(nombre);
    }

    public String getNombreStand() {
        return NombreStand;
    }
}
