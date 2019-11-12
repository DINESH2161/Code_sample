package testng_demo1;

import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void test3_1() {
		
		System.out.println("Test3_1........");
	}

	@Test
	public void test3_2() {
		
		System.out.println("Test3_2........");
	}

	@Test
	public void test3_3() {

		System.out.println("test3_3........");
	}

	@Test
	public void test3_4() {
		System.out.println("test3_4........");
	}

	@Test
	public void test3_5() {
		System.out.println("test3_5........");
	}
	 
	
	//@Test(invocationCount = 3, threadPoolSize = 3)
	/*public void test1() {

		System.out.println(Thread.currentThread().getId());

		System.out.println("Start Time: " + new Date().getTime());

		System.out.println("Test1........");

		System.out.print("End Time: " + new Date().getTime());
		
		System.out.println("---------------------");

	}
	*/

}
