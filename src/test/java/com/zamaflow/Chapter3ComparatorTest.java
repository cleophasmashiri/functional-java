package com.zamaflow;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import com.zamaflow.model.Person;
import com.zamaflow.service.ComparatorService;

public class Chapter3ComparatorTest { 
	
	private ComparatorService comparatorService;
	
	@Before
	public void setup() {
		comparatorService = new ComparatorService();
	}
	
	List<Person> people = Arrays.asList(
			new Person("John", 30),
			new Person("Sara", 21),
			new Person("Jane", 11),
			new Person("Greg", 35),
			new Person("Jane1", 10));
	
	@Test
	public void comparatorTest() {
		List<Person> peopleSortedAscByAge = comparatorService.sortByAgeAsc(people);
		
		assertEquals("Jane1", peopleSortedAscByAge.get(0).getName());
	}
	
	@Test
	public void comparatorTestDsc() {
		List<Person> peopleSortedAscByAge = comparatorService.sortByAgeDsc(people);
		
		assertEquals("Greg", peopleSortedAscByAge.get(0).getName());
	}
	

	@Test
	public void multiComparatorTest() {

		List<Person> peopleSortedAscByAge = comparatorService.sortByAgeAndName(people);
		assertEquals("Jane1", peopleSortedAscByAge.get(0).getName());
	}
}
	
