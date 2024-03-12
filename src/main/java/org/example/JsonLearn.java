package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonLearn {


    public static void main(String[] args) throws IOException {


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

        Map<Integer, StudentDTO> stddto = new HashMap<>();

        stddto.put(1,std);
        stddto.put(2,std2);

//        marksheet.generateResults(1,std);
//        marksheet.generateResults(2,std2);

        marksheet.generateResults(stddto);

    }
}
