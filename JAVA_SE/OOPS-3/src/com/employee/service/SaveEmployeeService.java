package com.employee.service;

import com.employee.dao.EmployeeDao;
import com.employee.pojo.Employee;

public interface SaveEmployeeService {

	void saveEmployee(Employee emp);
	public void setEmpDao(EmployeeDao empDao);

}