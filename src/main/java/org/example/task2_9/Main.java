package org.example.task2_9;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vera", "teacher", 25000);
        Employee employee2 = new Employee("Tim", "cook", 15000);

        employee1.increaseSalary(25);
        employee2.increaseSalary(20);

        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();
    }
}
