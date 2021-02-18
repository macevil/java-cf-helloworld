package de.kaffeemann.jch;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GreetingTest {

	private Greeting greeting;

	@Test
	public void getIdTest() {
		greeting = new Greeting("java", "content");
		assertTrue(greeting.getLanguage().equals("java"));
	}
	
	@Test
	public void getContentTest() {
		greeting = new Greeting("java", "content");
		assertTrue(greeting.getContent().equals("content"));
	}
}
