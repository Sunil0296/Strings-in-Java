package methods;

public class ChartAt {
public static void main(String[] args) {
	
	String s = "SUNIL KUMAR";
	System.out.println(s.charAt(3));
	
	String str = "Hello World";
	System.out.println(str.charAt(6));
	
	String lang = "JAVA";
	//System.out.println(lang.charAt(9)); // StringIndexOutOfBoundException
	
	String lang1 = "JAVA";
	System.out.println(lang1.charAt(-1));
}
}
