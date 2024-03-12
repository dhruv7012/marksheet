package org.example;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

import java.util.Iterator;
import java.util.Map;

public class Marksheet {
    public void generateResults(StudentDTO std) {

//        System.out.println();
//        System.out.println();
//        System.out.println("Mark sheet of " + std.student_name);
//
//        System.out.println("Subject Details");
//        for (Map.Entry<String, Double> entry : std.markMap.entrySet()) {
//            System.out.println("Subject Name = " + entry.getKey() +
//                    ", Marks = " + entry.getValue());
//        }
//
//        System.out.println("Total Marks : " +std.total_marks);
//        System.out.println("Average Marks : " + std.average_marks);
//        System.out.println("Grade : " + std.grade);
//




        Gson gs = new Gson();


        System.out.println(gs.toJson(std));

//        JSONObject obj=new JSONObject();
//
//        obj.put("1",gs.toJson(std));
//
//        System.out.println(obj);



    }
}
