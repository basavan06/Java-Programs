package Demo;

public class SortingArray2 
{
@SuppressWarnings({ })
public static void main(String[] args)
{
	
int[] a={3,4,1,2,9,5,8,6,-1,-7};
/*int m=0;
System.out.println("before sorting");
for(int k=0;k<a.length;k++)
{
	System.out.print(a[k]+" ");
}
	System.out.println();
for(int i=0;i<a.length;i++)
{
	for(int j=i;j<a.length;j++)
	{
		if(a[j]<a[i])
		{
			m=a[i];
			a[i]=a[j];
			a[j]=m;
		}
	} 
	System.out.println("after iteration:"+i);
for(int x=0;x<a.length;x++)
	System.out.print(a[x]+" ");
	System.out.println();

}
System.out.println("after sorting");
for(int k=0;k<a.length;k++)
{
	System.out.print(a[k]+" ");
}
*/
int temp;
for (int i = 1; i < a.length; i++) {
    for(int j = i ; j > 0 ; j--){
        if(a[j] < a[j-1]){
            temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
        }
    }
    System.out.println("after iteration:"+i);
    for(int x=0;x<a.length;x++)
    	System.out.print(a[x]+" ");
    	System.out.println();

    }
    System.out.println("after sorting");
    for(int k=0;k<a.length;k++)
    {
    	System.out.print(a[k]+" ");
    }
}
}






