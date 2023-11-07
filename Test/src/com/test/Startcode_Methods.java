package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class Startcode_Methods {
	
	public static void main(String[] args) {
		List<String> names = List.of("vaibhav", "vedu bobde", "veda", "vina","rutu");
		List<String> list = names.stream().filter(e->e.startsWith("v")).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> number = List.of(10,1, 2,5, 3, 4, 6, 7);
		List<Integer> list2 = number.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(list2);
		
		
		names.stream().forEach(e->{
			
			System.out.println(list);
		});
		
		names.stream().forEach(System.out::println);
		
		
		number.stream().sorted().forEach(System.out::println);
		
		Integer min = number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(min);
		
		Integer max = number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max);
	}
	
	

}