package string_programs;

public class Remove_WhiteSpaces {
public static void main(String[] args) {
	
	String str = "Su ni l ";
	String cleanstr  = "";
	
	for(int i=0; i<str.length()-1;i++) {
	char ch =	str.charAt(i);
	if(ch!=' ') {
	cleanstr =	cleanstr+ch;
	}
	}
	System.out.println(cleanstr);
}
}
