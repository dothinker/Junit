package helloworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class helloworldTest {

	helloworld hello= null;
	@Before
	public void setUp() throws Exception {
		hello = new helloworld();
	}

	@Test
	public void testAdd() {
		int a;
		a=hello.add(3,5);
		assertEquals(8, a);
	}

	@Test
	public void testJian() {
		int b;
		b=hello.jian(5, 3);
		assertEquals(2, b);
	}

}
