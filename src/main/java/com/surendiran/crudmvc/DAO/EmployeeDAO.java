package com.surendiran.crudmvc.DAO;

import com.surendiran.crudmvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
