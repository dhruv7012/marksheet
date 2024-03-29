package org.example;

import java.util.HashMap;
import java.util.Map;

public class StudentDTO {
    String student_name;
    double total_marks;
    Map<String , Double> subjectGrades = new HashMap<>();
    double average_marks;
    String grade;

    public double getAvgMarks() {
        if (subjectGrades.isEmpty()){
            return 0;
        }
        return total_marks/subjectGrades.size();
    }
    public String getGrades() {

        if (average_marks >= 90){
            return "A+";
        } else if (average_marks >= 80) {
            return "A";
        } else if (average_marks >= 70) {
            return "B+";
        }else if (average_marks >= 60){
            return "B";
        }else {
            return "Pass";
        }

    }

    public double getTotalMarks() {

        double cm = 0;

        for (Map.Entry<String, Double> entry : subjectGrades.entrySet()) {
            cm += entry.getValue();
        }

        return cm;
    }

    public StudentDTO(String fname,String lname, Map<String , Double> hmap) {
        this.student_name = fname + " " + lname;
        this.subjectGrades = hmap;
        this.total_marks = getTotalMarks();
        this.average_marks = getAvgMarks();
        this.grade = getGrades();
    }
}
