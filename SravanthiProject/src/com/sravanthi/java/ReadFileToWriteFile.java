package com.sravanthi.java;

import java.io.File;
import java.io.IOException;
 
public class ReadFileToWriteFile
{
 
    public static void main(String[] args) throws IOException
    {	
    	File myfile = new File("C://Myfile.txt");
    	//changing the file mode to writable
    	myfile.setWritable(true);
    	if (myfile.canWrite())
    	{
    	   System.out.println("File is writable.");
    	}
    	else
    	{
    	   System.out.println("File is read only.");
    	}
    }
}

