package demo4;

public class demo2 {
public static void main(String[] args) 
{
	int n=1234;
	int rem=0,rev=0;
	while(n>0)
	{
	rem=n%10;
	n=n/10;
	rev=rev*10+rem;
	}
	System.out.println(rev);
}
}
