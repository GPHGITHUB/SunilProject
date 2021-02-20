package project;
//sample TestNG Class
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testX() {
		Reporter.log("Hi",true);		
	}
	
	@Test
	public void testY() {
		Reporter.log("Hi",true);
	}
	
	@Test
	public void testR() {
		Reporter.log("Hi",true);
	}
	
}
