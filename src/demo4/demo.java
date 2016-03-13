package demo4;

public class demo {
public static void main(String[] args) {

	for(int i=1;i<100;i++)
	{
	boolean prime=true;
	for(int j=2;j<i;j++)
	{
	if(i%j==0)
	{
	prime=false;
	break;
	}
	}
	if(prime==true)
	{
	System.out.println(i);
	}
	}
}
}
