package gr.upatras.junit.ex1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyClassTest {
	@Test
	void testSubtrack() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.subtract(26, 12), "26 - 12 must be POSITIVE");
	}
}

