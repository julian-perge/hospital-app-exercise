package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest
{
	Janitor janitor = new Janitor("Jimmy", "677", 40_000, true);
	
	@Test
	public void shouldReturnTrueIfSweeeping()
	{
		boolean janitorIsSweeping = janitor.isSweeping();
		
		assertEquals(janitorIsSweeping, true);
	}
}
