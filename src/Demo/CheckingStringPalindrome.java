package Demo;

import java.util.Scanner;

public class CheckingStringPalindrome 
{
@SuppressWarnings("resource")
public static void main(String[] args) 
{
	System.out.println("Enter The String To Check Palindrome ot Not");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2="";
	int l=s1.length();
	for(int i=l-1;i>=0;i--)
	{
	s2=s2+s1.charAt(i);
	}
	if(s1.equals(s2))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is Not Palindrome");
	}
}
}
