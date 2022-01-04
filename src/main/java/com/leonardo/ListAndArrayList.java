package com.leonardo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArrayList {
    public static void main(String[] args) {
        System.out.println("List & ArrayList");
        //coleccion ordenada
        //permite duplicados
        // rápido para recuperaciones de datos
        // puede crecer
        //Diversas implementaciones
        // - ArrayList
        // - Stack
        // - Vector
        // - Otras
        List<String> colors = new ArrayList<>();
        //para agregar valores a la lista de todo pero con <String> especificas y previenes
        colors.add("blue");
        colors.add("green");
        System.out.println(colors); //podemos acceder así, simple
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));

        System.out.println("Iterando nuestro ArrayList");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\nUsing forEach");
        colors.forEach(System.out::println);

        System.out.println("\nUsing fori");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("//Ejemplo con numeros//");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        System.out.println(numeros.get(0));

        System.out.println("//Mejor forma de agregar una lista pero regresa una lista inmodificable//");
        List<Integer> nums = Arrays.asList(new Integer[]{4,8,8,});

        System.out.println(nums);

    }
}
