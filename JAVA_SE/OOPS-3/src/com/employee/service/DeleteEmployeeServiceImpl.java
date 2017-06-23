package com.employee.service;

import com.employee.dao.EmployeeDao;

public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {
	EmployeeDao empDao;

	@Override
	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void deleteEmployee(int empId) {
		empDao.deleteEmployee(empId);
	}

}
