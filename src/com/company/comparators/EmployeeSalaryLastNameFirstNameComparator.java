package com.company.comparators;

import com.company.model.Employee;

import java.util.Comparator;

public class EmployeeSalaryLastNameFirstNameComparator implements Comparator<Employee> {

    private boolean isSalaryDescending;

    public EmployeeSalaryLastNameFirstNameComparator(boolean isSalaryDescending) {
        this.isSalaryDescending = isSalaryDescending;
    }

    public EmployeeSalaryLastNameFirstNameComparator() {
        this(false);
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        int result;
        if (isSalaryDescending) {

            result = o2.getSalary().compareTo(o1.getSalary());
        } else {
            result = o1.getSalary().compareTo(o2.getSalary());
        }

        if (result == 0) { //same salary
            result = o1.getLastName().compareTo(o2.getLastName());
        }

        if (result == 0) { //same last names
            result = o1.getFirstName().compareTo(o2.getFirstName());
        }

        return result;
    }
}
