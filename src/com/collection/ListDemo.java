package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListDemo 
{
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(0,10);
	l.add(1,20);
	l.add(30);
	//l.add(null);
	//l.add(null);
	
	System.out.println(l);
	
	Iterator itr=l.iterator();//Iterator is having boolean value
	while (itr.hasNext());
	{
		System.out.println(itr.hasNext());
	}
	
	ListIterator litr=l .listIterator();//in list iterator we can iterate elements in both forward and backward direction
	while(litr.hasNext());//we can use (litr.hasPrevious()) also
	{
		System.out.println(litr.hasNext());
	}

}
}

