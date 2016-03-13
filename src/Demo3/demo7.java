package Demo3;

import java.util.HashSet;

public class demo7 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	String s="basasgowdgbo";
	char[] ch=s.toCharArray();
	HashSet set=new HashSet();
	System.out.println("Duplicates in String:-");
	for(int i=0;i<ch.length;i++)
	{
	if(set.add(ch[i])==false)
	{
	System.out.println(ch[i]);
	}
	}
}
}
