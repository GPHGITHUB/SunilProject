package project;
//sample TestNG Class
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testA() {
		Reporter.log("Hi",true);		
	}
	
	@Test
	public void testB() {
		Reporter.log("Hi",true);
		//hi
	}
	
	@Test
	public void testC() {
		Reporter.log("Hi",true);
		//hi
	}
}
