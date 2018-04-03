import java.io.*;
import java.util.*;
import java.lang.*;
public class LenghtOfStringExample {
public static void main(String[] args) throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a string to find its lenght:");
	String s=bf.readLine();
	int lenght =s.length();
	System.out.println("Enter the lenght of string:"+lenght);
	
}


}

