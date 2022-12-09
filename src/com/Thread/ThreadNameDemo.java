package com.Thread;

public class ThreadNameDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread task");
	}
	
public static void main(String[] args) 
{
	
	ThreadNameDemo th=new ThreadNameDemo();
	th.start();
	System.out.println(Thread.currentThread().getName());
	/*System.out.println("hello");
	
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("deepak");
	System.out.println("New Thread Name : "+Thread.currentThread().getName());*/
}
}
