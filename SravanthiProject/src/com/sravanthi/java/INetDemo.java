package com.sravanthi.java;
import java.io.*;
import java.net.*;
public class INetDemo {
	public static void main(String args[]) {
		try {
			InetAddress ip= InetAddress.getByName("www.javatpoint.com");
			System.out.println("Hostname:"+ip.getHostName());
			System.out.println("Ip Address:"+ip.getHostAddress());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
