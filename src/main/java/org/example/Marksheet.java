package org.example;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Marksheet {
    public void generateResults(Map<Integer, StudentDTO> map) throws IOException {

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

//
//        JSONObject j = new JSONObject();
//        for (Map.Entry<Integer, StudentDTO> entry : map.entrySet()) {
//            j.put(entry.getKey(),entry.getValue());
//        }


//        System.out.println(j.toJSONString());

        Gson gs = new Gson();
        System.out.println(gs.toJson(map));

//        JSONObject obj=new JSONObject();
//
//        obj.put("1",gs.toJson(std));
//
//        System.out.println(obj);

//        gs.toJson(map, new FileWriter("C:\\Dhruv\\JSONoutputs\\output.json"));


        try (FileWriter file = new FileWriter("C:\\Dhruv\\JSONoutputs\\output.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(gs.toJson(map));
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
