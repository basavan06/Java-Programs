package demo4;

public class demo4 {
public static void main(String[] args)
{
int a=0,b=0,c=1;
for(int i=0;i<10;i++)
{
a=b+c;
b=c;
c=a;
System.out.println(a);
}
}
}
