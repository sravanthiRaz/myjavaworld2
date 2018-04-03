package com.sravanthi.java;
import java.io.*;
import java.net.*;

public class URLDemo {
	public static void main(String args[]) {
		try {
			URL url=new URL("http://www.javatpoint.com/java-tutorial");
			System.out.println("protocol:" + url.getProtocol());
			System.out.println("HostName:"+ url.getHost());
			System.out.println("PortNama:"+ url.getPort());
			System.out.println("FileName:"+url.getFile());
	}
		catch (Exception e) {
			System.out.println();
		}
	
}
}
