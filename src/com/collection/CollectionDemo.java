package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo 
{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100)	;
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		
	ArrayList<Integer> al2=new ArrayList<Integer>();
	    al2.add(40);
	    al2.add(60);
	    al2.add(80);
	    
	    System.out.println(al2);
	   
	    al.addAll(al2);
	    System.out.println("copy arraylist is=" +al);
	    
	    Iterator<Integer> itr=al.iterator();
	    while(itr.hasNext());
	    {
	    	System.out.println(itr.next());
	    }
	/*ArrayList al2=new ArrayList();
	al2.add("Rahul");
	al2.add("Anmol");
	al2.add("amit");*/
	
	//System.out.println(al2);
	
   // al2.removeAll(al2);
   // System.out.println(al2);
	}	
}
