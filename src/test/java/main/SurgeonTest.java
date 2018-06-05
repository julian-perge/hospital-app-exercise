package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class SurgeonTest
{
	Surgeon surgeon = new Surgeon("Harry", "2424", 120_000, "Plastic", true);
	
	@Test
	public void shouldReturnSurgeonSalary()
	{
		int surgeonSalary = surgeon.calculatePay();
		
		assertThat(surgeonSalary, is(equalTo(120_000)));
	}

	@Test
	public void shouldReturnTrueIfSurgeonOperating()
	{
		boolean surgeonIsOperating = surgeon.isOperating();
		
		assertEquals(surgeonIsOperating, true);
	}
	
	@Test
	public void drawBloodShouldDecreasePatientBlood()
	{
		// Arrange
		Patient patient = new Patient(25, 25);
		int patientBloodBeforeCare = patient.getBloodLevel();
		
		// Act
		surgeon.drawBlood(patient);
		int patientBloodAfterCare = patient.getBloodLevel();
		
		// Assert
		assertThat(patientBloodAfterCare, is(equalTo(patientBloodBeforeCare - 5)));
	}
}
