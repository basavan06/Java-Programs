package Demo;

public class TrainglePascalReverse {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
    for(int j=i;j>1;j--)
    {
    System.out.print(" ");
    }
    for(int k=1;k<=7-(i-1);k++)
    {
    System.out.print(i);
    for(int k1=1;k1<k;k1+=k)
    {
    System.out.print(i);
    }
    }
    System.out.println();  
}
}
}