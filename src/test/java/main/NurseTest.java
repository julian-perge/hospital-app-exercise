package main;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class NurseTest
{
	Nurse jackie = new Nurse("Jackie", "2222", 5, 50_000);
	
	@Test
	public void calculateSalaryShouldReturnSalary()
	{
		// Arrange
		
		// Act
		int expectedSalary = 50_000;
		int nurseSalary = jackie.calculatePay();
		
		// Assert
		assertThat(nurseSalary, is(equalTo(expectedSalary)));
	}
	
	@Test
	public void careForPatientsShouldIncreasePatientHealth()
	{
		// Arrange
		Patient patient = new Patient();
		
		// Act
		int patientHealthBeforeCare = patient.getHealthLevel();
		jackie.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();
		
		// Assert
		assertThat(patientHealthAfterCare, is(equalTo(patientHealthBeforeCare + 5)));
	}
}
