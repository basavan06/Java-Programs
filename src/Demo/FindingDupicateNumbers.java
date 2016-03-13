package Demo;

import java.util.HashSet;
import java.util.Set;

public class FindingDupicateNumbers {
public static void main(String[] args) {
	int []a={1,2,3,3,2,1,1,1};
	Set<Integer>set=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		////If same integer is already present then add method will return FALSE
		if(set.add(a[i])==false)
		{
			System.out.println("Duplicate element found : " + a[i]);	
		}
	}
}
}
