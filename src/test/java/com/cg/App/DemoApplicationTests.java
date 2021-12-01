package com.cg.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.App.controller.Hello;

@SpringBootTest

class DemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	@Test
	public void testHello() {
		Hello hello = new Hello();
		String expected = "Hello world!";
		String output = hello.hello();
		assertEquals(expected, output);
	}

}
