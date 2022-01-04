package com.leonardo;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        //esta hecha de nodos y cada nodo contiene referecncias al siguiente y anterior nodo
        //para insertar un nuevo elemento debemos crear el nodo y saber en dónde lo pondremos
        //es una implementacion de la queue interface
        LinkedList linkedList = new LinkedList();
    }

    private static void queues() {
        Queue queue = new LinkedList<>();
        queue.add("alex");
        System.out.println(queue.getClass());
    }
}
