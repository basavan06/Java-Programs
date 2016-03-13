package Demo;

public class FindlingSmallestNumberInArray1 {
public static void main(String[] args) {
	int []a={4,5,8,9,95,10};
	int smallest=a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]<smallest)
	{
	smallest=a[i];
	}
	}
	System.out.println("Largest Number in Array is "+smallest);
}
}

