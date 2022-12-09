package com.collection;
//ListIterator
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo 
{
public static void main(String[] args) 
{
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add("deepak");
	l.add("Rahul");
	
	ListIterator li=l.listIterator();
	//li.next();
	//li.next();
	while (li.hasNext()) {
		System.out.println(li.next());
	}
	
	li.set(200);
	System.out.println(l);
}
}
