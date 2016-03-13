package Demo;

import java.util.Scanner;

public class StringReverse {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter The String To Reverse");
	String s1=sc.nextLine();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
	 s2=s2+s1.charAt(i);
	}
	System.out.println("String is Reversed:-"+ s2);
}
}
