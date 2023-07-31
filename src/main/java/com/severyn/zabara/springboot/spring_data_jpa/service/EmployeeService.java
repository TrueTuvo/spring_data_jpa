package com.severyn.zabara.springboot.spring_data_jpa.service;

import com.severyn.zabara.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployee(int id);

    public List<Employee> findAllByName(String name);

}
