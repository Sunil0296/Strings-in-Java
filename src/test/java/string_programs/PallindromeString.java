package string_programs;

public class PallindromeString {
public static void main(String[] args) {
	
	String str = "radar";
	String rev = "";
	
	for(int i=4;i>=0;i--) {
		rev = rev+str.charAt(i);
	}
	
	if(str.equals(rev)) {
		System.out.println("Pallindrome String");
	}else {
		System.out.println("Not a Pallinndrome String");
	}
}
}
