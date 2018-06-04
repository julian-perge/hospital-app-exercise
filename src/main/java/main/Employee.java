package main;

public abstract class Employee
{
	// instance
	private String name = "";
	private String idNumber = "";
	private int salary = 0;

	// getters
	public String getName()
	{
		return name;
	}
	public String getidNumber()
	{
		return idNumber;
	}

	//constructor
	public Employee(String name, String idNumber, int salary)
	{
		//super();
		this.name = name;
		this.idNumber = idNumber;
		this.salary = salary;
	}

	public int calculatePay()
	{
		return salary;
	}

//	@Override
//	public String toString()
//	{
//		return "Employee [name=" + name + ", idNumber=" + idNumber + "]";
//	}
}
