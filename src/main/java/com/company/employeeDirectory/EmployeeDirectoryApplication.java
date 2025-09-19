package com.company.employeeDirectory;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDirectoryApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        EmployeeService s = (EmployeeService) ctx.getBean("employeeService");

        s.addEmployee(new Employee(100, "Akash", 1000.0, "cse"));
        s.addEmployee(new Employee(100, "Balaji", 2000.0, "IT"));
        s.addEmployee(new Employee(100, "Charan", 3000.0, "IT"));

        System.out.println("Employees By Dept:");
        s.getEmployeesByDepartment("IT").forEach(System.out::println);

        System.out.println("Top Paid Employee:");
        System.out.println(s.getTopPaidEmployee());

        System.out.println("Employees Sorted by Name:");
        s.getEmployeesSortedByName().forEach(System.out::println);

        System.out.println("Department Mapping:");
        Map<String, List<Employee>> deptMap = s.getDepartmentMapping();
        deptMap.forEach((dept, emps) -> {
            System.out.println(dept);
            emps.forEach(e -> System.out.println("  " + e));
        });
    }
}