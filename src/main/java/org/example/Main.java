package org.example;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        int std_id;
        String std_firstName;
        String std_lastName;
        String std_address;
        String std_city;
        String std_class;


        System.out.print("Enter the number of student you want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();

        List<Student> studentlist = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Detail of Student " + (i + 1) + " (ID is set to " + (i + 1) + ")");
            std_id = (i + 1);
            System.out.print("Enter FirstName : ");
            std_firstName = sc.next();
            System.out.print("Enter LastName : ");
            std_lastName = sc.next();
            System.out.print("Enter Address : ");
            std_address = sc.next();
            System.out.print("Enter City : ");
            std_city = sc.next();
            System.out.print("Enter Class Name : ");
            std_class = sc.next();

            Student s = new Student(std_id, std_firstName, std_lastName, std_address, std_city, std_class);

            studentlist.add(s);

            System.out.println();
            System.out.println("Student Added ✔ ");
            System.out.println();
            System.out.println();
        }


        String subjectName;
        double subjectMark;
        int subjectId;

        int m;

        Map<String, Integer> subjectMap = new HashMap<>();
        ArrayList<Map<String, Double>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Map<String, Double> hasmap = new HashMap<>();

            System.out.println("How many subject has '" + studentlist.get(i).first_name + "' has taken ? ");
            System.out.print("Enter the number : ");

            m = sc.nextInt();

            for (int j = 0; j < m; j++) {

                System.out.print("Enter Subject " + (j + 1) + "'s Name : ");
                subjectName = sc.next();
                System.out.print("Enter Mark of " + subjectName + " : ");
                subjectMark = sc.nextDouble();

                System.out.println();

                if (!subjectMap.containsKey(subjectName)) {
                    subjectId = subjectMap.size() + 1;
                    subjectMap.put(subjectName, subjectId);
                } else {
                    subjectId = subjectMap.get(subjectName);
                }

                Subject subject = new Subject(subjectId, subjectName);
                Result result = new Result((arr.size() + 1),
                        subject.subject_id, (i + 1), subjectMark);
                hasmap.put(subjectName, subjectMark);


            }
            System.out.println();
            arr.add(hasmap);
        }
//        System.out.println(arr);


        Marksheet marksheet = new Marksheet();

        for (int i = 0; i < n; i++) {
            marksheet.generateResults(new StudentDTO(
                    studentlist.get(i).first_name,
                    studentlist.get(i).last_name,
                    arr.get(i)
            ));
        }

    }
}