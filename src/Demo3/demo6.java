package Demo3;

import java.util.Arrays;

public class demo6 {
public static void main(String[] args) {
char ch[]={'b','x','g','a','f'};
demo6 d=new demo6();
d.Sorting();

System.out.print("Arry is Sorted:-");
for(int i=0;i<ch.length;i++)
{
System.out.print(" "+ch[i]);
}
}

public void Sorting()
{
char ch[]={'b','x','g','a','f'};
Arrays.sort(ch);
System.out.print("After sorting arry:-");
for(int i=0;i<ch.length;i++)
{
System.out.print(" "+ch[i]);
}
}
public char[] SortingArry(char[] ch)
{
for(int i=0;i<ch.length;i++)
{
for(int j=0;j<i;j++)
{
if(ch[j]>ch[j+1])
{
char temp=ch[j+1];
ch[j+1]=ch[j];
ch[j]=temp;
}
}
}
return ch;
}
}


