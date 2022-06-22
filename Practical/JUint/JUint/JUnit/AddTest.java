package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	
	// creating a class of object
	public void Addtest() {
		
		MyJUnit mju =new MyJUnit();
		
		int result = mju.add(10,60);
      assertEquals (50,result);		
		
		}

}
