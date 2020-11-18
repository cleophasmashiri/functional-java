package com.zamaflow;

import java.util.List;
import java.util.function.Consumer;

public class CollectionsService {

	public void printList(List<String> items) {
		items.forEach(new Consumer<String>() {
			public void accept(final String s) {
				System.out.print(s);
			}
		});

	}
	
	public void printListFunctionally(List<String> items) {
		items.forEach(System.out::print);
	}
	

}
