package org.example.task2_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ivan", 345, 4.5);
        students[1] = new Student("Kate", 123, 3.9);
        students[2] = new Student("Ira", 567, 4.2);

        for(Student student: students){
            student.printStudentDetails();
        }
    }
}
