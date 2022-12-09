package com.Thread;
//By extending Thread class

public class Test extends Thread {
 public void run() {
System.out.println("Thread class");
 }
 
 public static void main(String[] args) {
	Test t =new Test();
	t.start();
	//t.start();//Exception(IllegalThreadStateException
}
}
