package methods;

public class Contains {
public static void main(String[] args) {
	
	String s = "sunil";
	System.out.println(s.contains("ni")); //true
	
	String text = "Java Programming";
	System.out.println(text.contains("java")); //false
	
	String str = "hello";
	System.out.println(str.contains("")); // true
	
	String strr = "Sunil";
	System.out.println(strr.contains(null)); // null pointer exception
}
}
