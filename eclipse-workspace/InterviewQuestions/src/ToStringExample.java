import java.util.ArrayList;
import java.util.HashMap;

public class ToStringExample {
	
		 
    public String toString(){
       return "test";
    }
	    public static void main(String args[]){
	        ArrayList<String> l = new ArrayList<>();
	        l.add("A");
	        l.add("B");
	        System.out.println(l);
	        
	        HashMap m = new HashMap();
	        m.put(101, "Aparna");
	        m.put(102, "Vissu");
	        System.out.println(m);
	        
	        String S = new String("Aparna");
	        System.out.println(S);
	        
	        Integer i = new Integer(10);
	        System.out.println(i);
	        
	        ToStringExample test = new ToStringExample();
	        System.out.println(test);    
	    }
	


}
