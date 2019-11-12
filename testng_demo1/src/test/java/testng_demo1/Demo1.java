package testng_demo1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@Parameters({"uername","passwrd"})
	@Test()
	public void test1(@Optional("vijaykk@gmail.com")String uname,@Optional("1234567890")String pwd) {
		
		System.out.println(uname+" "+pwd);

	}

}
