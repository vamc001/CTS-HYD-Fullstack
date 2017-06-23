package com.employee.service;

import com.employee.dao.EmployeeDao;
import com.employee.pojo.Employee;

public class SaveEmployeeServiceImpl implements SaveEmployeeService {

	private EmployeeDao empDao;

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void saveEmployee(Employee emp) {

		empDao.saveEmployee(emp);

	}

}
