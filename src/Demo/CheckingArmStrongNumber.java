package Demo;

public class CheckingArmStrongNumber {
public static void main(String[] args) {
	int n=123;
	int rem=0;
	int c=0;
	int s=n;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		c=c+(rem*rem*rem);
	}
	System.out.println(c);
	if(s==c)
	{
		System.out.println("Number is a ArmStrong Number");
	}
	else
	{
		System.out.println("Number is not ArmStrong Number");
	}
}
}
