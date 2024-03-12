package org.example;

public class Result {

    int result_id;
    int subject_id;
    int student_id;
    double mark;

    public Result(int result_id, int subject_id, int student_id, double mark) {
        this.result_id = result_id;
        this.subject_id = subject_id;
        this.student_id = student_id;
        this.mark = mark;
    }
}
