package Demo;

public class CheckingNumberPalindrome {
public static void main(String[] args) {
	int n=12331;
	int rev=0;
	int rem=0;
	int s=n;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		rev=rev*10+rem;
	}
	if(s==rev)
	{
	System.out.println("Number is Palindrome");
	}
	else
	{
	System.out.println("Number is Not Palindrome");
	}
}
}
