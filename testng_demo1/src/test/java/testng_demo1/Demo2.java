package testng_demo1;

import java.util.Date;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void test2_1() {
		
		System.out.println("Starting MilliSeconds: 1   "+new Date().getTime());
		
		System.out.println("Test 1 : "+ Thread.currentThread().getId());
		
		System.out.println("Ending MilliSeconds: 1   "+new Date().getTime());	
	}

	@Test
	public void test2_2() {
		System.out.println("Starting MilliSeconds: 2   "+new Date().getTime());
		
		System.out.println("Test 2 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 2   "+new Date().getTime());
	}

	@Test
	public void test2_3() {

		System.out.println("Starting MilliSeconds: 3   "+new Date().getTime());
		System.out.println("Test 3 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 3   "+new Date().getTime());
	}

	@Test
	public void test2_4() {
		System.out.println("Starting MilliSeconds: 4   "+new Date().getTime());
		System.out.println("Test 4 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 4   "+new Date().getTime());
	}

	@Test
	public void test2_5() {
		System.out.println("Starting MilliSeconds: 5   "+new Date().getTime());
		System.out.println("Test 5 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 5   "+new Date().getTime());
	}

	@Test
	public void test2_6() {
		System.out.println("Starting MilliSeconds: 6   "+new Date().getTime());
		System.out.println("Test 6 : "+ Thread.currentThread().getId());

		System.out.println("Ending MilliSeconds: 6   "+new Date().getTime());
	}
}
