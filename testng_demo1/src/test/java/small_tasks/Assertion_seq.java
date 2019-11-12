package small_tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_seq {

	@Test
	public void test1() {
		System.out.println("Start_1");

		Assert.assertEquals(true, true);

		try {
		Assert.fail();
		}
		
		catch (AssertionError e)
		{
			System.out.println(" Assertion error occurs.......");
			
		}
		System.out.println("End_1");
	}

	@Test
	public void test2() {

		System.out.println("Start_2");

		Assert.assertEquals(true, true);

		Assert.assertEquals(true, true);


		System.out.println("End_2");

	}

	@Test
	public void test3() {

		System.out.println("Start_3");

		Assert.assertEquals(true, true);

		Assert.assertEquals(true, true);

		System.out.println("End_3");
	}
}
