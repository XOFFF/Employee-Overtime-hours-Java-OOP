package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int overtime_hours = 2;
        int salary_per_overtime_hour = 50;
        Employee employee = new Employee("Marko", "Gocoolenko", 19, 700);
        WorkingOvertime workingOvertime = new WorkingOvertime(employee.getName(), employee.getSurname(), employee.getAge(), employee.getSalary(), overtime_hours, salary_per_overtime_hour);
        System.out.println(workingOvertime.name + ' ' + workingOvertime.surname +" salary after overtime calculating is: " + workingOvertime.SalaryAndOvertime());
    }
}
