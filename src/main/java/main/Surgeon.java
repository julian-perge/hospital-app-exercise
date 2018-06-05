package main;

public class Surgeon extends Doctor
{
	private boolean isOperating = false;
	
	public Surgeon(String name, String idNumber, int salary, String specialty, boolean isOperating)
	{
		super(name, idNumber, salary, specialty);
		this.isOperating = isOperating;
	}

	public boolean isOperating()
	{
		return isOperating;
	}

	@Override
	public String toString()
	{
		return "Surgeon [getName()=" + getName()
				+ ", getidNumber()=" + getidNumber()
				+ ", getSpecialty()=" + getSpecialty() 
				+ ", isOperating()=" + isOperating() + "]";
	}
	
	
}
