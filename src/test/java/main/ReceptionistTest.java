package main;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest
{
	Receptionist recep = new Receptionist("Jamie", "555", 45_000, true);
	
	@Test
	public void calculatePayShouldReturnReceptionistPay()
	{
		int receptionPay = recep.calculatePay();
		
		assertThat(receptionPay, is(equalTo(45_000)));
	}
	
	@Test
	public void shouldReturnIfReceptionistIsOnPhone()
	{
		boolean recepIsOnPhone = recep.isOnPhone();
		
		assertEquals(recepIsOnPhone, true);
	}
}
