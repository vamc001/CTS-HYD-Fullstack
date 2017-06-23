package com.employee.dao;

import java.util.List;

import com.employee.pojo.Employee;
//Dependency
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee emp) {
		System.out.println("--- dao: " + emp.getEmpName() + " saved to DB");

	}

	@Override
	public List<Employee> listEmps() {
		return null;
	}

	@Override
	public Employee findById(int empId) {
		return null;
	}

	@Override
	public void updateEmpployee(Employee newEmpObj) {
		System.out.println("--- dao: " + newEmpObj.getEmpName() + " updated to DB");
	}

	@Override
	public void deleteEmployee(int empId) {
		System.out.println("--- dao: " + empId + " is deleted from DB");
	}

}
