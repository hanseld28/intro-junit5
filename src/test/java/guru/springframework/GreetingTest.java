package guru.springframework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class GreetingTest {

	@Test
	void testHelloWorld() {
		Greeting greeting = new Greeting();
		
		System.out.println(greeting.helloWorld());
	}
	
	@Test
	void testHelloWorldWithName() {
		Greeting greeting = new Greeting();
		
		System.out.println(greeting.helloWorld("Hansel"));
	}
	

}
