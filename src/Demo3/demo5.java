package Demo3;

import java.util.Arrays;

public class demo5 
{
	static int arr[]={3,1,5,69,10,6,10,0,2};
public static void main(String[] args) 
{
	demo5 d=new demo5();
	d.Sorting();
	int b[]=d.SortingArry(arr);
	System.out.print("Arry is Sorted:-");
	for(int i=0;i<b.length;i++)
	{
	System.out.print(" "+arr[i]);
	}
}
public void Sorting()
{
Arrays.sort(arr);
System.out.print("After sorting arry:-");
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}
}
public int[] SortingArry(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<i;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
}
}
}
return arr;
}
}
