package small_tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	
	
	@Test
	public void test1() {

		SoftAssert ass = new SoftAssert();
		
		System.out.println("Start_1");

		ass.assertEquals(true, true);

		ass.assertEquals(true, true);

		ass.assertTrue(false);

		ass.assertEquals(true, true);

		ass.assertEquals(true, true);

		System.out.println("End_1");
		
		ass.assertAll();

	}

	
	  @Test public void test2() {
	  
	  SoftAssert ass = new SoftAssert();
	  
	  System.out.println("Start_2");
	  
	  ass.assertEquals(true, true);
	  
	  ass.assertEquals(true, true);
	  
	  ass.fail();
	  
	  ass.assertEquals(true, true);
	  
	  ass.assertEquals(true, true);
	  
	  System.out.println("End_2");
	  
	  ass.assertAll();
	  
	  }
	  
	  
	  @Test public void test3() {
	  
	  SoftAssert ass = new SoftAssert();
	  
	  System.out.println("Start_3");
	  
	  ass.assertEquals(true, true);
	  
	  ass.assertEquals(true, true);
	  
	  ass.fail();
	  
	  ass.assertEquals(true, true);
	  
	  ass.assertEquals(true, true);
	  
	  System.out.println("End_3");
	  
	  ass.assertAll();
	  
	  }
	 

}
