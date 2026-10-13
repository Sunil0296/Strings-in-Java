package string_programs;

public class CharacterOccurence {
public static void main(String[] args) {
	
	String str = "SUNIL KUAMR R";
	char target = 'U';
	int count =0;
	
	for(int i=0; i<=str.length()-1; i++) {
		if(str.charAt(i)==target) {
			count++;
		}
	}
	
	System.out.println(count);
}
}
