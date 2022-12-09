package com.collection;

import java.util.Stack;

public class StackDemo 
{
public static void main(String[] args) {
	Stack s=new Stack();
	s.push("deepak");
	s.push("amit");
	s.push(10);
	s.push(100.10);
	s.push("deepak");
	s.push(null);
	
	System.out.println(s.empty());
	//System.out.println(s);
	//System.out.println(s.search("ritu"));
	//System.out.println(s.search("deepak"));
	//System.out.println(s.peek());
	//System.out.println(s.pop());
	//System.out.println(s);
	//System.out.println(s.pop());
}
}
