package com.employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.service.DeleteEmployeeService;
import com.employee.service.DeleteEmployeeServiceImpl;
import com.employee.service.SaveEmployeeService;
import com.employee.service.SaveEmployeeServiceImpl;

public class HR {

	public static void main(String[] args) {
		
		//EmployeeDao empDao=new EmployeeDaoImpl();
		//empDao.
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalalry(489638);
		
		
		//------------------------------------------
			EmployeeDao empDao=new EmployeeDaoImpl();
		//------------------------------------------
		
		
		SaveEmployeeService saveEmpService=new SaveEmployeeServiceImpl();
		saveEmpService.setEmpDao(empDao);		
		saveEmpService.saveEmployee(emp);
		
		
		DeleteEmployeeService deleteService=new DeleteEmployeeServiceImpl();
		deleteService.setEmpDao(empDao);
		deleteService.deleteEmployee(emp.getEmpId());
		//deleteService.
		
		
		

	}

}
