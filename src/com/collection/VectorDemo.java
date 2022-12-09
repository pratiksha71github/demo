package com.collection;

import java.util.Vector;

public class VectorDemo 
{
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Sumit");
	v.add(10);
	v.add(101.1);
	v.add(null);
	v.add(1,"Sumit");
	v.addElement(null);
	
	v.setElementAt("aaa",1);
	
	//System.out.println(v);
	//System.out.println(v.firstElement());
	//System.out.println(v.lastElement());
	//System.out.println(v.removeElement("Sumit"));
	//v.removeAllElements();
	//System.out.println(v.capacity());
	System.out.println(v);
}
}
