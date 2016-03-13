package Demo;

public class SortingArrayWithOutSort {
public static void main(String[] args) {
	int[]a={1,4,7,8,3,10,6,2};
	System.out.println("Before Sorting:-");
	for(int k=0;k<a.length;k++)
	{
	System.out.print(" "+a[k]);
	}
	for(int i=1;i<a.length;i++)
	{
	for(int j=i;j<a.length;j++)
	{
	if(a[j]<a[i])
	{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	System.out.println();
	System.out.println("after iteration:"+i);
	for(int x=0;x<a.length;x++)
		System.out.print(a[x]+" ");
	System.out.println();
	}
	System.out.println("after sorting");
	for(int k=0;k<a.length;k++){
		System.out.print(a[k]+" ");
	}
}
}
