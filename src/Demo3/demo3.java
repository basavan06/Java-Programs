package Demo3;

public class demo3 {
public static void main(String[] args) {
	{
		int arry[]={10,23,18,8,70,34,54};
		int small=arry[0];
		int smallestNumber = 0;
		for(int i=0;i<arry.length;i++)
		{
		if(arry[i]<small)
		{
		smallestNumber=arry[i];
		}
		}
		System.out.println("Small Number in Array is:-"+smallestNumber);
	}
}
}
