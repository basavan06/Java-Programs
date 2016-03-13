package Demo3;

import java.util.Arrays;

public class demo 
{
static int count=0;
public static void main(String[] args) 
{
	demo d=new demo();
	d.String();
	d.IntArry();
}
public void String()
{
String s="basavan";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a')
{
count++;
}
}
System.out.println(count);
}
public void IntArry()
{
int a[]={3,3,2,4,4,2};
Arrays.sort(a);
for(int i=1;i<a.length;i++)
{
if(a[i]==a[i-1])
{
	System.out.println(a[i]);
}
}
}
}
