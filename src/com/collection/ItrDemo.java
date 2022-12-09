package com.collection;
//Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo
{
public static void main(String[] args)
{
	List l=new ArrayList();
	l.add(100);
	l.add(200);
	l.add("deepak");
	l.add("Rahul");
	
	//System.out.println(l);
	
	Iterator itr=l.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next());
}
	//l.remove(1);
	l.add("sumit");
	System.out.println(l);
}
}