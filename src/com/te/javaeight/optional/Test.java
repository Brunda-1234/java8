package com.te.javaeight.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer("103","Brunda");
		Optional<String> map = Optional.ofNullable(customer.getName()).map(name ->{
			String id = customer.getId();
			return id;
		});
	
		System.out.println(map);
	}
}
