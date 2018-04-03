package com.sravanthi.java;
import java.io.*;
import java.net.*;
public class URLConnectionDemo {
public static void main(String args[]) {
	try {
	URL url= new URL("http://www.javatpoint.com/java-tutorial");
	HttpURLConnection hup= (HttpURLConnection)url.openConnection();
	
for(int i=0;i<=8;i++)
{
	System.out.println(hup.getHeaderFieldKey(i)+"= "+ hup.getHeaderField(i));
}
hup.disconnect();
	
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
