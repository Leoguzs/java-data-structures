package com.leonardo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayList {
    public static void main(String[] args) {

        System.out.println("//////////////////LINKED LIST////////////////////");
        LinkedList<String> namesLinkedList = new LinkedList<>(); //nodos(elementos)
        namesLinkedList.add("Leonardo");
        System.out.println(namesLinkedList.toArray()[0]);
        System.out.println(namesLinkedList.get(0));
        //LinkedList toma de referencia el primer y ultimo elemento
        //para encontrar un valor se tarda m+ás porque tomas dos referencias
        //ventajas añadiendo o eliminando elementos  porque insertas el index, ´rev y next ej
        namesLinkedList.add(1, "Pablo");
        System.out.println(namesLinkedList);

        System.out.println("//////////////////ARRAY LIST////////////////////");

        List<String> namesArrayList = new ArrayList<>(); //funciona como array pero con tamaño modificable
        namesArrayList.add("Carlos");
        namesArrayList.add(1, "Eduardo");
        System.out.println(namesArrayList.contains("Calors"));
        System.out.println(namesArrayList.get(0));
        //usa un array para guardar todos los valores
        //le toma a JAVA el mismo tiempo traer un valor u otro
        //para agregar o eliminar empieza creando otro arreglo, tan largo para satisfacer los requerimientos
        //tarda demasiado


        System.out.println("Cuando usamos un LinkedList: " +
                "- Insertar o remover un dato " +
                "ArrayList: " +
                "es más fácil obtener un dato" +
                "" +
                "" +
                "Nota: debemos tener en cuenta si nuestro conjunto es muy largo,  no , no habrá " +
                "mucha diferencia");


    }
}
