package Demo3;

public class demo4 {
public static void main(String[] args) {
	int LargestNumber = 0;
	int arry[]={10,23,18,8,70,34,54};
	int large=arry[0];
	for(int i=0;i<arry.length;i++)
	{
	if(arry[i]>large)
	{
		LargestNumber=arry[i];
	}
	}
	System.out.println("Small Number in Array is:-"+LargestNumber);
}
}

