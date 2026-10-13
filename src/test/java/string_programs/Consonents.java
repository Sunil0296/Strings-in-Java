package string_programs;

public class Consonents {
public static void main(String[] args) {
	
	//not  vowels
	
	String str = "SuniLkUAMR";
	str = str.toLowerCase();
	int consonents = 0;
	
	for(int i=0; i<=str.length()-1;i++) {
	char c = str.charAt(i);
	if(c>='a' && c<='z') {
		if(c!='a' && c!='e' && c!='o' && c!='u') {
			consonents++;
		}
	}
	}
	
	System.out.println(consonents);
}
}
