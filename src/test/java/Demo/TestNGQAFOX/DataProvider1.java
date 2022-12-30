package Demo.TestNGQAFOX;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	
	@Test(dataProvider="getData")
	public void LoginTest(String username, String password) {
		System.out.println("User got sucessfully"+username+ "and passowrd" +password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0] = "Viswa";
		data[0][1] ="123";
		
		data[1][0] ="Vinod";
		data[1][1] ="22";
		
		data[2][0] ="Viss";
		data[2][1] ="MO";
		
		return data;
	}

}
