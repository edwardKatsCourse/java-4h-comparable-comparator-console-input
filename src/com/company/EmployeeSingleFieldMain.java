package com.company;

import com.company.model.EmployeeSingleField;

import java.util.Arrays;

public class EmployeeSingleFieldMain {

    public static void main(String[] args) {

        EmployeeSingleField [] fields = new EmployeeSingleField[] {
                new EmployeeSingleField(),
                new EmployeeSingleField(),
                new EmployeeSingleField(),
                new EmployeeSingleField(),
                new EmployeeSingleField(),
                new EmployeeSingleField(),
                new EmployeeSingleField(),
        };

        Arrays.sort(fields);

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }
    }


}
