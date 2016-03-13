package Demo;

public class PrimeNumbers {
public static void main(String[] args) {
	boolean Prime = true;
	int i;
	for(i=1;i<=100;i++)
	{
	 Prime=true;
	
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
		Prime=false;
		break;
		}
	}
	if(Prime==true)
	{
	System.out.print(i+" ");
	}
	}
	
	
}
}
