package main;

public class Doctor extends Employee implements CareForPatient, DrawBloodFromPatient
{
	private String specialty = "";
	
	public String getSpecialty()
	{
		return specialty;
	}

	public Doctor(String name, String idNumber, int salary, String specialty)
	{
		super(name, idNumber, salary);
		this.specialty = specialty;
	}
	
	public void careForPatient(Patient patient)
	{
		patient.heal(10);
	}
	
	public void drawBlood(Patient patient)
	{
		patient.drawBlood(5);
	}
}
