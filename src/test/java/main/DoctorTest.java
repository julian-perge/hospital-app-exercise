package main;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class DoctorTest
{
	Doctor doctor = new Doctor("Phil", "1122", 90_000, "Brain");
	
	@Test
	public void careForPatientShouldIncreasePatientHealth()
	{
		// Arrange
		Patient patient = new Patient(25, 25);
		int patientHealthBeforeCare = patient.getHealthLevel();
		
		// Act
		doctor.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();
		
		// Assert
		assertThat(patientHealthAfterCare, is(equalTo(patientHealthBeforeCare + 10)));
	}
	
	@Test
	public void shouldReturnDoctorSalary()
	{
		int doctorSalary = doctor.calculatePay();
		
		assertThat(doctorSalary , is(equalTo(90_000)));
	}
}
