package main;

public class Receptionist extends Employee
{
	private boolean isOnPhone = true;

	public Receptionist(String name, String idNumber, int salary, boolean isOnPhone)
	{
		super(name, idNumber, salary);
		this.isOnPhone = isOnPhone;
	}

	public boolean isOnPhone()
	{
		return isOnPhone;
	}
}
