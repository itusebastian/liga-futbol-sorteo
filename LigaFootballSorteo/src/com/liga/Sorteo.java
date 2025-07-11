package com.liga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteo {
    // Método recursivo para emparejar equipos aleatoriamente
    public static List<Partido> sortearPartidos(List<Equipo> equipos) {
        List<Partido> partidos = new ArrayList<>();
        if (equipos.size() < 2) {
            return partidos;
        }
        Collections.shuffle(equipos);
        partidos.add(new Partido(equipos.get(0), equipos.get(1)));
        List<Equipo> restantes = equipos.subList(2, equipos.size());
        partidos.addAll(sortearPartidos(restantes));
        return partidos;
    }
}
