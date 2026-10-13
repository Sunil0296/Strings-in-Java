package methods;

public class Equals {
public static void main(String[] args) {
	
	String s = "sunil";
	String s1 = "Sunil";
	System.out.println(s.equals(s1)); // case sensitive
	
	String a =  "Sunil";
	String b = "sunil";
	System.out.println(a.equalsIgnoreCase(b)); // nocase sensitive
}
}
