package guru.springframework;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before - I am only called Once!!!");
	}
	
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
	
	@Test
	void testHelloWorldWithName2() {
		System.out.println(greeting.helloWorld("Aléxia"));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("In After Each...");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After - I am only called Once!!!");
	}
}
