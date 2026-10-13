package string_programs;

public class Special_Character {
public static void main(String[] args) {
	
	String str = "Sunil@0298";
	str = str.toLowerCase();
	int count = 0;
	
	for(int i=0;i<=str.length()-1;i++) {
	char ch =	str.charAt(i);
	
	if(!(ch>='a' && ch<='z')&& !(ch>='0'&& ch<='9')) {
		count++;
	}
	
	}
	System.out.println(count);
}
}
