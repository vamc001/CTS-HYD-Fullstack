package com.employee.dao;

import java.util.List;

import com.employee.pojo.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	List<Employee> listEmps();

	Employee findById(int empId);

	void updateEmpployee(Employee newEmpObj);

	void deleteEmployee(int empId);

}