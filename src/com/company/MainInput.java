package com.company;

import com.company.model.Employee;

import java.util.Scanner;

public class MainInput {

    public static void main(String[] args) {

//        System.out.println("Enter your text:");
//        String text = new Scanner(System.in).nextLine();
//
//        System.out.println(String.format("You entered: [%s]", text));
//
//        System.out.println("________________________");
//
//        System.out.println("Enter first name:");
//        String firstName = new Scanner(System.in).nextLine();
//
//
//        System.out.println("Enter last name:");
//        String lastName = new Scanner(System.in).nextLine();
//
//
//        System.out.println("Enter salary:");
//        String stringDouble = new Scanner(System.in).nextLine();
//        Double salary = Double.parseDouble(stringDouble);
//
//
//        System.out.println("Enter company name:");
//        String companyName = new Scanner(System.in).nextLine();
//
//        Employee employee = new Employee(firstName, lastName, salary, companyName);
//
//        System.out.println(String.format("Employee -> [%s]", employee.toString()));


        Employee employee = getEmployee();
    }

    private static Employee getEmployee() {

        System.out.println("Enter your first name:");
        String fName = new Scanner(System.in).nextLine();

        System.out.println("Enter your last name:");
        String lName = new Scanner(System.in).nextLine();

        System.out.println("Enter your salary: ");
        String employeeSalaryString = new Scanner(System.in).nextLine();
        Double employeeSalary = Double.parseDouble(employeeSalaryString); //"15.09" -> 15.09

        System.out.println("Enter your company:");
        String employeeCompany = new Scanner(System.in).nextLine();

        //fName, lName, employeeSalary, employeeCompany

        Employee employee1 = new Employee(fName, lName, employeeSalary, employeeCompany);

        return employee1;
    }
}
