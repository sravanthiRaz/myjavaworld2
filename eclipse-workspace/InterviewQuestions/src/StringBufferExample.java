import java.lang.*;
public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Sravanthi");
		sb.append("Raz");
		System.out.println(sb);
		sb.insert(2,"raz");
		System.out.println(sb);
		sb.replace(1, 9, "Madhu");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	

}
