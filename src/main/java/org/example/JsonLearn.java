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

        Map<String, Double> hasmap2 = new HashMap<>();

        hasmap.put("DSA" , 10.0);
        hasmap.put("JAVA" , 70.0);

        StudentDTO std = new StudentDTO("Dhruv","Parekh",hasmap);
        StudentDTO std2 = new StudentDTO("Maan","Laad",hasmap2);

//        marksheet.generateResults(1,std);
//        marksheet.generateResults(2,std2);


    }
}
