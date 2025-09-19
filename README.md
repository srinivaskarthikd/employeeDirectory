Problem 3: Employee Directory with Department Mapping 🧑‍💼
This project demonstrates managing an employee directory and grouping them by department using core Java collections and Spring Framework.

Description 📝
The goal is to create a system that can manage employees and organize them based on their respective departments. This showcases the use of various Java collections and lambda expressions for data manipulation, along with Spring Core for dependency injection and bean management.

Requirements 📋
Class: Employee
Attributes:

id (int)

name (String)

salary (double)

department (String)

Implementation:

The Employee class must implement Comparable<Employee> to allow sorting employees by their salary in ascending order.

Collections Usage
A List<Employee> will be used to store all employee objects.

Lambda expressions will be used with Collections.sort() to sort the employees by name.

A Map<String, List<Employee>> will be used to group employees, where the key is the department name (String) and the value is a List<Employee> belonging to that department.

Spring Core
An EmployeeService class will be created as a Spring bean.

This service will contain the following methods:

addEmployee(Employee): Adds a new employee to the directory.

getEmployeesByDepartment(String dept): Retrieves all employees in a specific department.

getTopPaidEmployee(): Returns the employee with the highest salary.

The bean usage will be demonstrated using AnnotationConfigApplicationContext to load the application context and retrieve the EmployeeService bean.
