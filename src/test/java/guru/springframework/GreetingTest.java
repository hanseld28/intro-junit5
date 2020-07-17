package guru.springframework;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;


public class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeEach
	void setUp() {
		System.out.println("In Before Each");
		greeting = new Greeting();
	}
	
	@Test
	void testHelloWorld() {
		System.out.println(greeting.helloWorld());
	}
	
	@Test
	void testHelloWorldWithName() {
		System.out.println(greeting.helloWorld("Hansel"));
	}
	

}
