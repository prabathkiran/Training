package testing.TryingQmetry;

import org.testng.annotations.Test;

public class FirstTest {

	
	@Test(groups = {"smoke"})
	public void first()
	{
		System.out.println("1st method from firstTest");
		 
	}
	

	@Test
	public void middle()
	{
		System.out.println("2nd method  firstTest");
		 
	}
	
	@Test(groups = {"smoke"})
	public void last()
	{
		System.out.println("3rd method  firstTest");
	} 
	
}
