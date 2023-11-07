package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Without Stream API");
        
        
        List<Integer> list1 = List.of(1, 4, 6, 9,15,37);
        List<Integer> evenList=new ArrayList<Integer>();
        
        list1.forEach(e->{
        	if(e%2==0)
        	{
        		evenList.add(e);
        		
        	}
        	
        	
        });
        
        System.out.println(list1);
        System.out.println(evenList);
        
        System.out.println(" Stream API");
        
        
        
        List<Integer> collect = list1.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(collect);
        
        List<Integer> collect2 = list1.stream().filter(e->e>10).collect(Collectors.toList());
        System.out.println(collect2);
    }
    

}
