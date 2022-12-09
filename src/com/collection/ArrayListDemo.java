package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add(0, 10);
		al.add(1, "deepak");
		al.add(2, 'c');
		al.add(3, 0.14);
		al.add(4, 10);
		al.add(5,null);
		al.add(6,null);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		//System.out.println(al.indexOf(10));
		
		/*al.set(2,"sushant");
		System.out.println(al);*/
		
		//System.out.println(al.contains(0.14));
		
		//System.out.println(al.size());
		
		//System.out.println(al.get(3));
		
      //  al.clear();
		//System.out.println(al);
		/*ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(0.14);
		al2.add("amit");
		*/
	//	System.out.println(al2);
		
		//al.addAll(al2);
		//al.removeAll(al2);
	//System.out.println(al);
		
	//Design the generatic arraylist for Integer type only.	
	/*ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	
	for(int i:al) {
		System.out.println(""+i);
	}
	
	//Design generic ArrayList for String type only. 
	
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("10");
	al1.add("20");
	
	for(String str:al1) {
	System.out.println(""+str);
	}*/
}
}