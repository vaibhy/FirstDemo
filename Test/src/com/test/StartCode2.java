package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StartCode2 {
    public static void main(String[] args) {
	
	//First Way - Blank
	
	
	Stream<Object> empty = Stream.empty();
	empty.forEach(e->{
		
		
		System.out.println(e);
	
	});
	//Second  Way - array,object,collection
	
		String names[]= {"vaibhav","durgesh","swati","meena"};
		Stream<String> stream1 = Stream.of(names);
	
			stream1.forEach(e->{
				
				System.out.println(e);
			});

			//Third  Way - builder()
			Stream<Object> build = Stream.builder().build();
			System.out.println(build);
			
			
			//Arrys
			IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
			stream.forEach(e->{System.out.println(e);});
    }

}


