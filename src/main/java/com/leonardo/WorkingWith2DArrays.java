package com.leonardo;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {

        System.out.println("Creando juego de gato con Arrays " +
                "bidimensionales");
        char [] [] tabla = new char [3] [3]; //tres filas, tres columnas

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla [i] [j] = '-';
            }
        }
        System.out.println("deeptoString porque es arreglo 2D");
        System.out.println(Arrays.deepToString(tabla));
        System.out.println("lo cambiamos para que haya un ganador");
        tabla [0] [0] = 'x';
        tabla [1] [0] = 'x';
        tabla [2] [0] = 'x';
        System.out.println(Arrays.deepToString(tabla));

        System.out.println("Cuando sabemos que le queremos" +
                "incluir");

        char tabla2 [] [] = new  char [] [] {
            new char [] {'-', '-', 'x'},
                new char[] {'-', 'x', '-'},
                new char[] {'x', '-', '-'}
        };
        System.out.println(Arrays.deepToString(tabla2));
    }
}
