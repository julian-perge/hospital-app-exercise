package main;

public class Nurse extends Employee implements CareForPatient
{
	public int getNumOfPatients()
	{
		return numOfPatients;
	}

	private int numOfPatients = 0;
	
	public Nurse(String name, String idNumber, int numOfPatients, int salary)
	{
		super(name, idNumber, salary);
		this.numOfPatients = numOfPatients;
	}
	
	public void careForPatient(Patient patient)
	{
		patient.heal(5);
	}
}
