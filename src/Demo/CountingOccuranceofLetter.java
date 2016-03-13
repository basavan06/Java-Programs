package Demo;

public class CountingOccuranceofLetter {
public static void main(String[] args) {
	String s="basavan";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a')
		{
			count++;
		}
	}
	System.out.println("Occurance of a in "+s+" is "+count);
}
}
