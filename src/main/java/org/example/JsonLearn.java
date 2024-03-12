package org.example;

import java.util.HashMap;
import java.util.Map;

public class JsonLearn {


    public static void main(String[] args) {


        Marksheet marksheet = new Marksheet();
        Map<String, Double> hasmap = new HashMap<>();

        hasmap.put("DS" , 100.0);
        hasmap.put("JAVA" , 70.0);
        hasmap.put("Angular" , 80.0);

        StudentDTO std = new StudentDTO("Dhruv","Parekh",hasmap);

        marksheet.generateResults(std);


    }
}
