import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertion.*;

import org.junit.Test;


public class PersonTest {

	public void setUp() throws Exception{
		
		
	}
	
	@Test 
	public void constructorOrderTest() {
		
	}

	
	
	@Test
	public void test() {
		String firstName = "";
		@SuppressWarnings("unused")
		String lastName = "Smith";
		Person x = new Person(firstName,lastName);
		fail("not yet implemented");
	}
}
