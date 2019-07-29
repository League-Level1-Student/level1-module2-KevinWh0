package _05_unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mytest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		for(int i = 0; i<100; i++) {
			System.out.println(i);
			assertEquals(i*10,multi(i,10));
		}
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		for(int i = 0; i<100; i++) {
			System.out.println(i);
			assertEquals(i*20,multi(i,20));
		}
	}

	public int multi(int i, int j) {
		return i*j;
	}

}
