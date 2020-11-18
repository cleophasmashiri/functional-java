package com.zamaflow.model;

public class Person {
	
	private final int age;
	private final String name;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int ageDifference(final Person p2) {
		return age - p2.age;
	}
	
	public String toString() {
		return String.format("%s - %d", name, age);
	}
}
