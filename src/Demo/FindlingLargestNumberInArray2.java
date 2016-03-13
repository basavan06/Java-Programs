package Demo;

public class FindlingLargestNumberInArray2 {
public static void main(String[] args) {
	int[]a={33,53,73,94,22,45,23,87,13,63};
	int largest=a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>largest)
	{
	largest=a[i];
	}
	}
	System.out.println("Largest Number is "+largest);
}
}
