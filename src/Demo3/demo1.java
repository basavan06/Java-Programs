package Demo3;

import java.util.HashSet;

public class demo1 
{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args)
{
int arr[]={5,6,4,1,1,6,5};
HashSet set=new HashSet();
System.out.print("Following are The Duplicates:- ");
for(int i=0;i<arr.length;i++)
{
if(set.add(arr[i])==false)
{
System.out.print(" "+arr[i]);
}
}
}
}
