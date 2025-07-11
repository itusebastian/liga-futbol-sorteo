package com.liga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Sorteo de la Liga de Fútbol");
        System.out.println("Etapas disponibles: octavos, cuartos, semifinales");
        System.out.print("Ingrese la etapa: ");
        String etapa = scanner.nextLine().trim().toLowerCase();
        int numEquipos = 0;
        switch (etapa) {
            case "octavos":
                numEquipos = 16;
                break;
            case "cuartos":
                numEquipos = 8;
                break;
            case "semifinales":
                numEquipos = 4;
                break;
            default:
                System.out.println("Etapa no válida.");
                return;
        }
        List<Equipo> equipos = new ArrayList<>();
        for (int i = 1; i <= numEquipos; i++) {
            System.out.print("Ingrese el nombre del equipo " + i + ": ");
            String nombre = scanner.nextLine().trim();
            equipos.add(new Equipo(nombre));
        }
        List<Partido> partidos = Sorteo.sortearPartidos(equipos);
        System.out.println("\nPartidos para la etapa de " + etapa + ":");
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
    }
}
