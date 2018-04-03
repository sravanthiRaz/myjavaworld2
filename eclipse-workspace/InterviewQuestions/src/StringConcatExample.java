
import java.io.*;
 
public class StringConcatExample{
  public static void main(String[] args) throws IOException{
  BufferedReader bf = 
new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter Your First String:");
  String s1 = bf.readLine();
  System.out.println("Enter Your Second String:");
  String s2 = bf.readLine();
 
  String s3 = s1.concat(s2);
  System.out.println("Concatenated string is: " + s3);
  }
}