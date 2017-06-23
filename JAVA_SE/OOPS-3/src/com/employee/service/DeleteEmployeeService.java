package com.employee.service;

import com.employee.dao.EmployeeDao;

public interface DeleteEmployeeService {

	void setEmpDao(EmployeeDao empDao);

	void deleteEmployee(int empId);

}