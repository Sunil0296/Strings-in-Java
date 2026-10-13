package string_programs;

public class Count_Without_Spaces {
public static void main(String[] args) {
	
	
	String str= "S UN I L KU M A R";
	int count =0;
	
	for(int i=0;i<=str.length()-1;i++) {
	char ch =	str.charAt(i);
	if(ch!=' ') {
		count++;
	}
	}
	System.out.println(count);
}
}
