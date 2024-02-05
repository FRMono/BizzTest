package org.example;

import org.testng.annotations.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class Main {
    public static void main(String[] args) {
        System.out.println("Elige la flecha que quieras para saber si estás capacitado...");

        System.out.println("1 . Flecha Sanguínea (MDY REDS)");
        System.out.println("2 . Flecha Animal (OOG'S WAY)");
        System.out.println("3 . Flecha Robot (SRFR'S HIGHWAY)");

        Scanner scanner = new Scanner(System.in);
        int opcionFlecha = scanner.nextInt();
        scanner.nextLine();

        Stand Stand = null;
        switch (opcionFlecha) {
            case 1:
                Stand = Stand.crearStandF();
                break;
            case 2:
                Stand = Stand.crearStandP();
                break;
            case 3:
                Stand = Stand.crearStandA();
                break;
        }

        System.out.println("Tienes el poder de : " + Stand.NombreStand);
    }

}