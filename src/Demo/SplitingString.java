package Demo;

import java.util.StringTokenizer;

public class SplitingString {
public static void main(String[] args) {
	String s = "This is the text to be split into words. 12 ho 45";  
	StringTokenizer tk = new StringTokenizer(s); 
	
	while (tk.hasMoreTokens()) {  
	    String word = tk.nextToken();  
	    System.out.println(word);
}
}
}
