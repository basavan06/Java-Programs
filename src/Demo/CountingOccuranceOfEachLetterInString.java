package Demo;

import java.util.*;

public class CountingOccuranceOfEachLetterInString
{
public static void main(String[] args) 
{
	/*String str = "Programming";
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (char ch : str.toCharArray()) 
	{
		if (map.containsKey(ch))
		{
			int val = map.get(ch);
			System.out.println("Getting char from map:-"+map.get(ch));
			System.out.println(" "+ch);
			//System.out.println(val);
			map.put(ch, val + 1);
			System.out.println("Map values in if "+ch);
			System.out.println("Map values in if "+map);
			
		} 
		else 
		{
			map.put(ch, 1);
			System.out.println("char values in esle "+ch);
			System.out.println("Map values in esle "+map);
			
		}
	}
	System.out.println(map);
*/
	String s="collectionsl";
	
HashMap<Character,Integer>map=new HashMap<Character,Integer>();
for(char ch:s.toCharArray())
{
	if(map.containsKey(ch))
	{
		int val=map.get(ch);
		map.put(ch, val+1);
	}
	else
	{
		map.put(ch, 1);
	}
}
System.out.println(map);
}
}
