package com.Thread;
//By implementing runnable interface

public class Testt implements Runnable {

	@Override
	public void run() 
	{
		System.out.println("Thread task");
		
	}
public static void main(String[] args) {
	 Testt t=new Testt();
	 Thread th=new Thread(t);
	 th.start();
	 
}
}
