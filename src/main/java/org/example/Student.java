package org.example;

public class Student {

    int student_id;
    String first_name;
    String last_name;
    String address;
    String city;
    String class_name;

    public Student(int student_id, String first_name, String last_name, String address, String city,String class_name) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.class_name = class_name;
    }
}
