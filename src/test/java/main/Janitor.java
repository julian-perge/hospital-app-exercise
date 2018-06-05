package main;

public class Janitor extends Employee
{
	private boolean isSweeping = true;
	
	public boolean isSweeping()
	{
		return isSweeping;
	}

	public Janitor(String name, String idNumber, int salary, boolean isSweeping)
	{
		super(name, idNumber, salary);
		this.isSweeping = isSweeping;
	}

}
