package com.leonardo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExcercise {

    public static void main(String[] args) {
        String [] amigos = new String[5]; //nunca cambiará tamaño
        amigos[0] = "Leonardo";
        amigos[1] = "Diana";

        System.out.println(Arrays.toString(amigos));
        System.out.println(amigos.length);
        System.out.println("no podemos eliminar");

        List<String> colores = new ArrayList<>();
        colores.add("azul");
        colores.add("verde");
        colores.add("magenta");
        System.out.println(colores);
        colores.set(0, "naranja");
        System.out.println(colores.get(0));
        colores.remove(1);
        System.out.println(colores);
        System.out.println(colores.size());

    }
}
