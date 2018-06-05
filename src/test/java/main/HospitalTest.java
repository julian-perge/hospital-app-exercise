package main;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class HospitalTest
{
	Hospital hospital = new Hospital();
	
	Doctor phil = new Doctor("Phil", "222", 90_000, "Brain");
	Surgeon harry = new Surgeon("Harry", "333", 120_000, "Plastic", true);
	Nurse jackie = new Nurse("Jackie", "111", 50_000, 6);
	Receptionist janine = new Receptionist("Janine", "444", 45_000, true);
	Janitor rosie = new Janitor("Rosie", "555", 40_000, true);
	
	@Test
	public void shouldReturnAllEmployees()
	{
		hospital.addEmployee(jackie);
		hospital.addEmployee(harry);
		hospital.addEmployee(phil);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		
		int numOfEmployeesAfter = hospital.getEmployees().size();
		
		assertThat(numOfEmployeesAfter, is(equalTo(5)));
	}
	
	@Test
	public void shouldAddEmployee()
	{
		int numOfEmployeesBefore = hospital.getEmployees().size();
		
		hospital.addEmployee(jackie);
		
		int numOfEmployeesAfter = hospital.getEmployees().size();
		
		assertThat(numOfEmployeesAfter, is(equalTo(numOfEmployeesBefore + 1)));
	}
	
//	@Test
//	public void shouldListEmployeeProperties()
//	{
//		System.out.println(jackie.toString());
//		System.out.println(harry.toString());
//	}
}
