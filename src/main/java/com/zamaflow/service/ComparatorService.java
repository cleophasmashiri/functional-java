package com.zamaflow.service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


import com.zamaflow.model.Person;

public class ComparatorService {

	Comparator<Person> comparatorAsc = (p1, p2) -> p1.ageDifference(p2);

	public List<Person> sortByAgeAsc(List<Person> people) {
		return people.stream().sorted(comparatorAsc).collect(Collectors.toList());
	}

	public List<Person> sortByAgeDsc(List<Person> people) {
		return people.stream().sorted(comparatorAsc.reversed()).collect(Collectors.toList());
	}

	public List<Person> sortByAgeAndName(List<Person> people) {
		Function<Person, Integer> byAge = p -> p.getAge();
		Function<Person, String> byName = p -> p.getName();
		return people.stream()
		.sorted(Comparator
		.comparing(byAge)
		.thenComparing(byName))
		.collect(Collectors.toList());
	}

}
