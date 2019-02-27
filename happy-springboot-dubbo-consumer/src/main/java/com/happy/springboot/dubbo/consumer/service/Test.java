package com.happy.springboot.dubbo.consumer.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(3);
	list1.add(2);
	list1.add(5);
	list1.add(1);
	System.out.println(list1);
	
	Collections.sort(list1);
	System.out.println(list1);
	
	List<Integer> list2 = new ArrayList<Integer>();
	for(Integer i  : list1) {
		list2.add(i); 
	}
	System.out.println(list2);
	}
}
