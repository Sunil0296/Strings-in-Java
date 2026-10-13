package methods;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	
	String str = "Sunil@0296";
String a[] =	str.split("@");
	System.out.println(Arrays.toString(a));
	
	String line = "Apple,Banana,Orange";
	String l[] = line.split(",");
	System.out.println(Arrays.toString(l));
	
	// .  | *
	
	String ip = "192.168.1.1";
	String []segements = ip.split("\\.");
	System.out.println(Arrays.toString(segements));
}
}
