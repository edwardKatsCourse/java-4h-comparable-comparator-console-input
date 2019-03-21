package com.company.model;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private Double salary;
    private String company;

    /**
     * Comparing
     * this. vs other
     *
     * 1 - this. is bigger than other
     * -1 - other is bigger than this.
     *
     * 0 - they are equal
     */
    @Override
    public int compareTo(Employee other) {

        int result = this.firstName.compareTo(other.getFirstName());

        if (result == 0) { //both first names are same
            result = this.lastName.compareTo(other.getLastName());
        }

        if (result == 0) { //both first names and last names are equal!
            //low salary to high
//            result = this.salary.compareTo(other.salary);

            //high salary to low
            result = other.getSalary().compareTo(this.getSalary());

            //ASC -> this.compareTo(other)
            //DESC -> other.compareTo(this)
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Last name: %s \nFirst name: %s \nSalary: %s \nCompany: %s\n\n",
                this.lastName,
                this.firstName,
                this.salary,
                this.company
        );
    }

    /**
     *  constructor (default & with all fields)
     *  getters/setters
     *
     *  alt + insert
     *
     *  toString()
     */







    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee() {
    }



    public Employee(String firstName, String lastName, Double salary, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
    }


}
