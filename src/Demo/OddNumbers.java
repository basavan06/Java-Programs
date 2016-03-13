package Demo;

import java.util.Scanner;

public class OddNumbers {
@SuppressWarnings("resource")
public static void main(String[] args) {
	System.out.println("Enter The Number");
	Scanner sc=new Scanner(System.in);
	int Upto=sc.nextInt();
	for(int i=0;i<=Upto;i++)
	{
	if(i%2!=0)
	{
		System.out.print(" "+i);
	}
	}
	
}
}
