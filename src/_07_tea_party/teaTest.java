package _07_tea_party;

import static org.junit.Assert.*;

import org.junit.Test;

public class teaTest {
	Greet greet = new Greet();
	@Test
	public void test() {
		assertEquals("Welcome Mr. Smith",greet.greetpeople("Smith", false, "Male"));
	}

}
