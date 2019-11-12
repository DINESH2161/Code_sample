package testng_demo2;

import java.util.Date;

import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void test3_1() {
		
		System.out.println("Starting MilliSeconds: 1   "+new Date().getTime());
		
		System.out.println("Test 1 : "+ Thread.currentThread().getId());
		
		System.out.println("Ending MilliSeconds: 1   "+new Date().getTime());	
	}

	@Test
	public void test3_2() {
		System.out.println("Starting MilliSeconds: 2   "+new Date().getTime());
		
		System.out.println("Test 2 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 2   "+new Date().getTime());
	}

	@Test
	public void test3_3() {

		System.out.println("Starting MilliSeconds: 3   "+new Date().getTime());
		System.out.println("Test 3 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 3   "+new Date().getTime());
	}

}
