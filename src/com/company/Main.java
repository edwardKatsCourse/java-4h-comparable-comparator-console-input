package com.company;

import com.company.comparators.EmployeeSalaryLastNameFirstNameComparator;
import com.company.model.Employee;

import java.util.Arrays;

public class Main {

    /**
     * Comparable (default) vs Comparator (optional)
     *
     * model
     * dto | entity
     */
    public static void main(String[] args) {


        Employee[] employees = new Employee[]{
                new Employee("John", "Smith", 10000., "ABC LTD."),
                new Employee("Marry", "Dale", 12500., "ABC LTD."),

                new Employee("Garret", "Stone", 8000., "ABC LTD."),
                new Employee("Janet", "Davids", 8000., "XYZ Inc."),
                new Employee("Jane", "Harrolds", 8000., "Z.Y.X. Inc."),
                new Employee("Jinny", "Simons", 8000., "Haifa Port"),
                new Employee("Jene", "Simons", 8000., "Haifa Port"),
                new Employee("Jane", "Simons", 8000., "Z.Y.X. Inc."),

                new Employee("Peter", "Jackson", 6500., "ABC LTD."),
                new Employee("Peter", "Abrams", 55000., "Z.Y.X. Inc."),
                new Employee("Peter", "Jones", 11200., "Z.Y.X. Inc."),
                new Employee("Peter", "Thomas", 2550., "Bituah Leumi"),
                new Employee("Peter", "Thomas", 10500., "Elbit Systems"),
                new Employee("Peter", "Thomas", 30000., "Google"),
                new Employee("Peter", "Thomas", 35000., "Facebook")
        };

        printEmployees(employees);

        System.out.println("________________");

        //Array
        //Arrays

        //Collection
        //Collections

        Arrays.sort(employees); //Employee implements Comparable vs Comparator

        printEmployees(employees);

        System.out.println("________________");

        Arrays.sort(employees, new EmployeeSalaryLastNameFirstNameComparator(true));

        printEmployees(employees);

    }

    private static void printEmployees(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}