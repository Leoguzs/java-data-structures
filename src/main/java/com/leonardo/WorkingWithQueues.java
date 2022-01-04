package com.leonardo;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        //poll removes
        Queue<String> fila = new LinkedList<>();

        fila.add("Mariana");
        fila.add("Josue");
        fila.add("Susan");
        System.out.println(fila);
        System.out.println(fila.poll()); //sacamos a alguien de la fila
        System.out.println(fila);

        System.out.println("\nPodemos acceder como si fuera un arreglo");
        System.out.println(fila.toArray()[0]);

    }
}