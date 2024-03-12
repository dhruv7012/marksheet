package org.example;

import java.util.Iterator;
import java.util.Map;

public class Marksheet {
    public void generateResults(StudentDTO std) {

        System.out.println();
        System.out.println();
        System.out.println("Mark sheet of " + std.student_name);

        System.out.println("Subject Details");
        for (Map.Entry<String, Double> entry : std.markMap.entrySet()) {
            System.out.println("Subject Name = " + entry.getKey() +
                    ", Marks = " + entry.getValue());
        }

        System.out.println("Total Marks : " +std.total_marks);
        System.out.println("Average Marks : " + std.average_marks);
        System.out.println("Grade : " + std.grade);


//        Iterator<Map.Entry<String, Double>> itr = std.markMap.entrySet().iterator();
//
//        while(itr.hasNext())
//        {
//            Map.Entry<String, Double> entry = itr.next();
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//        }
    }
}
