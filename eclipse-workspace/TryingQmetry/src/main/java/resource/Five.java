package resource;

import org.testng.annotations.Test;

public class Five {

	@Test(groups = {"smoke"})
	public void mode()
	{
		System.out.println("from resource package");
	}
}
