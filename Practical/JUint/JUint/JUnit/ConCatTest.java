package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	// creating a class of object
		public void concattest() {
			
			MyJUnit mju =new MyJUnit();
			
			String result = mju.ConCat("MY"," LIFE");
	      assertEquals ("MY LIFE",result);		
			
		
	}
}
