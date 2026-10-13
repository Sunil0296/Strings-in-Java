package methods;

public class Trim {
public static void main(String[] args) {
	
	String s = " SUNIL ";
	System.out.println(s.length());
	s = s.trim();
	System.out.println(s.length());
	
	String a = " S U N I L ";
	System.out.println(a.length());
	a = a.replace(" ", "");
	System.out.println(a.length());
	
}
}
