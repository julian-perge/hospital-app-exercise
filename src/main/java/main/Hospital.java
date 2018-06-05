package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital
{
	// id number of employee && employee 
	Map<String, Employee> employees = new HashMap<>();
	
	public Collection<Employee> getEmployees()
	{
		return employees.values();
	}
	
	public void addEmployee(Employee employee)
	{
		employees.put(employee.getidNumber(), employee);
	}
}
