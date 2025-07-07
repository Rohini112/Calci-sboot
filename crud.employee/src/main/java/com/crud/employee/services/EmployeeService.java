package com.crud.employee.services;

import com.crud.employee.entities.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);
	Employee searchEmployee(int id);
	void updateEmployee(Employee emp);
	void deleteEmployee(int id);
}
