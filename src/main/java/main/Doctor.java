package main;

public class Doctor extends Employee implements CareForPatient
{
	private String specialty = "";
	
	public String getSpecialty()
	{
		return specialty;
	}

	public Doctor(String name, String idNumber, String specialty, int salary)
	{
		super(name, idNumber, salary);
		this.specialty = specialty;
	}
	
	public void careForPatient(Patient patient)
	{
		patient.heal(10);
	}
}
