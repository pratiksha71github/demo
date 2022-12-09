package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
public static void main(String[] args) 
{
	LinkedList l = new LinkedList();
	l.add("deepak");
	l.add("rahul");
	l.add(10);
	l.add(124.7);
	l.add("deepak");
	l.add(null);	
	l.add(null);
	System.out.println(l);
	
	/*System.out.println(l.getFirst());
	System.out.println(l.getLast());*/
	
	/*l.removeFirst();
	l.removeLast();
	System.out.println(l);
	*/
	/*l.addFirst("aaa");
	l.addLast(100);
	System.out.println(l);*/
	
	/*Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());*/
	}
	//System.out.println(l);
	//l.clear();
	//System.out.println();
	//System.out.println(l.contains(2000));
	
	/*LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add("amit");
	l1.add(null);
	l1.add("deepak");
	l1.add(30);
	
	l.add(l1);
	l.addAll(l1);
	System.out.println(l);*/

}

