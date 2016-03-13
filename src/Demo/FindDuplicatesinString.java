package Demo;

import java.util.HashSet;

public class FindDuplicatesinString {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	String s="basavangowdfhrh22";
	char[]a=s.toCharArray();
	HashSet set=new HashSet();
	System.out.print("Following are the Duplicates:-");
	for(int i=0;i<s.length();i++)
	{
	if(set.add(a[i])==false)
	{
	System.out.println(" "+a[i]);
	}
	}
}
}
