package stringBuffer;

public class StringBufferr {
public static void main(String[] args) {
	
	StringBuffer s  = new StringBuffer("welcome");
	System.out.println(s.reverse());
	System.out.println(s.append("to java"));
	
	StringBuilder s1 = new StringBuilder("welcome");
	System.out.println(s1.reverse());
}
}
