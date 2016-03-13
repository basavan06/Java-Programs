package Demo;

import java.util.Scanner;

public class SplittingString1 {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	String s="basavangowd";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sub String");
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	System.out.println(s.substring(sub1,sub2));
	
}
}
