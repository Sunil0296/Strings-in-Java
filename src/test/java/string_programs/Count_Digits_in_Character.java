package string_programs;

public class Count_Digits_in_Character {
public static void main(String[] args) {
	
	String str = "Automation Testing 2026";
	int count = 0;
	
	for(int i=0; i<=str.length()-1;i++) {
	char ch =	str.charAt(i);
	if(ch>='0' && ch<='9') {
		count++;
	}
	}
	
	System.out.println(count);
}
}
