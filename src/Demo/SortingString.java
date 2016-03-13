package Demo;

import java.util.Arrays;

public class SortingString {
public static void main(String[] args) {
	String s="gowd";
	char b[]=s.toCharArray();
	Arrays.sort(b);
	for(int i=0;i<s.length();i++)
	{
	System.out.println("Sorted String:-"+b[i]);
	}
}
}
