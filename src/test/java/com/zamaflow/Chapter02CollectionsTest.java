package com.zamaflow;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Chapter02CollectionsTest {
	
	private final PrintStream stdOut = System.out;
	private final ByteArrayOutputStream o = new ByteArrayOutputStream();
	
	private CollectionsService colSvc;

	@Before
	public void setup() {
		colSvc = new CollectionsService();
		System.setOut(new PrintStream(o));
	}
	
	@Test
	public void outTest() {
		List<String> items = Arrays.asList("Mike", "John");
		colSvc.printList(items);
		assertEquals("MikeJohn", o.toString());
	}
	
	@Test
	public void givenListStringsShouldPrint() {
		List<String> items = Arrays.asList("Mike", "John");
		colSvc.printListFunctionally(items);
		assertEquals("MikeJohn", o.toString());
	}
	
	@After
	public void cleanUp() {
		System.setOut(stdOut);
	}

}
