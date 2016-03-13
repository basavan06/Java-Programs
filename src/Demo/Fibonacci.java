package Demo;

public class Fibonacci 
{
public static void main(String[] args) {
	int a=0,b=0,c=1;
	System.out.println(a);
	System.out.println(c);
	for(int i=0;i<10;i++)
	{
	a=b+c;
	b=c;
	c=a;
	System.out.println(a);
	}
}
}
