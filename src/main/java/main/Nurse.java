package main;

public class Nurse extends Employee implements CareForPatient
{
	public int getNumOfPatients()
	{
		return numOfPatients;
	}

	private int numOfPatients = 0;
	
	public Nurse(String name, String idNumber, int salary, int numOfPatients)
	{
		super(name, idNumber, salary);
		this.numOfPatients = numOfPatients;
	}
	
	public void careForPatient(Patient patient)
	{
		patient.heal(5);
	}

	@Override
	public String toString()
	{
		return "Nurse [getNumOfPatients()=" + getNumOfPatients() + ", getName()=" + getName() + ", getidNumber()="
				+ getidNumber() + "]";
	}
	
	
}
