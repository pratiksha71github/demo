package com.collection;

import java.util.HashSet;

public class HashSetDemo 
{
public static void main(String[] args) {
	HashSet hashset=new HashSet();
	hashset.add("ram");
	hashset.add("shyam");
	hashset.add(10);
	hashset.add(101.01);
	hashset.add(null);
	//hashset.add(null);
	//hashset.add("ram");
	
	System.out.println(hashset);
			
}
}
