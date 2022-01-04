package com.leonardo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// un map no puede tener keys duplicadas
//cada key debe tener máximo un valor
//map es como un objeto de javasript
//key: value
//no garantiza orden
//put agrega o actualiza
public class WorkingWithMaps {

    public static void main(String[] args) {

        HashMap<Integer, String> empIds = new HashMap<>();

        empIds.put(1, "Leonardo");
        empIds.put(2, "Carlos");
        empIds.put(45, "Francisco");
        empIds.put(5, "Berenice");
        empIds.put(5, "Diana");
        System.out.println(empIds);
        System.out.println(empIds.get(1));
        System.out.println(empIds.containsKey(1));
        System.out.println(empIds.containsValue("Francisco"));
        System.out.println(empIds);
empIds.remove(45);
        System.out.println(empIds);


    }
}
