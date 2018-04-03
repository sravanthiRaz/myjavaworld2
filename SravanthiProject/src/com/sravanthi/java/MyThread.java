package com.sravanthi.java;

public class MyThread extends Thread {
	public static void main(String[] args) {
	MyThread my= new MyThread();
	my.start();

}
}
//no outut.
//It is highly recommend to overwrite run() mehtod otherwise dont go for multithreading concept.