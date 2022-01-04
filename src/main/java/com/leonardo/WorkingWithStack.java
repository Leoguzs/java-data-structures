package com.leonardo;

import java.util.List;
import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        //metodos (push, pop, peek, top)
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(96);
        System.out.println(stack);
        System.out.println("Eliminamos el numero de la pila " + stack.pop());
        System.out.println("Obtenemos el numero de arriba de la pila: " + stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());



    }
}
