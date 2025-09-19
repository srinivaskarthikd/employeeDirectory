package com.company.employeeDirectory;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee() {

    }

    public Employee(int id, String name, double salary, String department) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }

}