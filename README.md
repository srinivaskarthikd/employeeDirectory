# Problem 3: Employee Directory with Department Mapping

## Description

This project demonstrates how to manage employee data, grouping them by department, using a combination of **Java Collections** and **Spring Core**.

---

## Requirements

### `Employee` Class

The `Employee` class has the following attributes:

- `id`: `int`
- `name`: `String`
- `salary`: `double`
- `department`: `String`

It also implements the `Comparable<Employee>` interface to enable sorting employees by their salary.

---

### Collections Usage

- A **`List<Employee>`** is used to store all employee objects.
- **Lambda expressions** with `Collections.sort()` are used to sort the employees by name.
- A **`Map<String, List<Employee>>`** is used to group employees, where the key is the department name and the value is a list of employees in that department.

---

### Spring Core

A Spring bean, **`EmployeeService`**, is created with the following methods:

- `addEmployee(Employee employee)`: Adds a new employee to the directory.
- `getEmployeesByDepartment(String dept)`: Retrieves a list of all employees in a specific department.
- `getTopPaidEmployee()`: Returns the single employee with the highest salary.

The project demonstrates the usage of these beans with **`AnnotationConfigApplicationContext`**.
