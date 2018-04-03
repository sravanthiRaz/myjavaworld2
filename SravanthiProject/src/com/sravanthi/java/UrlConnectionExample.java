package com.sravanthi.java;
import java.io.*;
import java.net.*;
public class UrlConnectionExample {
	public static void main(String args[]) {
		try {
		URL url= new URL("http://www.javatpoint.com/java-tutorial");
		URLConnection uc= url.openConnection();
		InputStream stream= uc.getInputStream();
		int i;
		while((i=stream.read())!=-1){
			System.out.print((char)i);
			
		}
		}catch(Exception e) {
				System.out.println();
			}
		
		
	
	}

}
