package com.leonardo;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        //especificar el tipo de dato
        String [] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "yellow";
        System.out.println(colors[0]);

        String [] frutas = {"platano", "manzana"};
        System.out.println(Arrays.toString(frutas));

        //para imprimir los colores
        System.out.println(Arrays.toString(colors));

        colors[2] = "purple";
        System.out.println(Arrays.toString(colors));


        System.out.println("/////////Array of numbers: cuando no sabes los elementos/////////");
        int[] numbers = new int [2];
        numbers[0] = 0;
        numbers[1] = 1;
        System.out.println(numbers[0]);

        System.out.println("///cuando sabes los elementos /////");
        int [] nums =  {2,4,5,6,7};
        System.out.println(nums[0]);
        System.out.println("una vez que defines el arreglo," +
                "ya no puedes cambiar el tamaño ");

        System.out.println("Iterar en Arreglos con ciclo for");

        for (int i = 0; i < nums.length ; i++) { //fori  atajo
            System.out.println(nums[i]);

        }

        System.out.println("Iterar en Arreglos con ciclo for (alernativa");

        for (String color : colors) {
            System.out.println("color: " + color);
        }

        System.out.println("///con numeros//");
        for(int num : nums) {
            System.out.println("numero:" + num);
        }

        System.out.println("///otra forma más///");
        Arrays.stream(colors).forEach(System.out::println);


    }
}
