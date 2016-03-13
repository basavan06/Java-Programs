package Demo;

public class LegnthofStringWithoutUsingLenth 
{
@SuppressWarnings("unused")
public static void main(String[] args) 
{
String s="gowd";
int count=0;
for(char c:s.toCharArray())
{
	count++;
}
System.out.println("length of "+s+"is:- "+count);
}
}
