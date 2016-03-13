package demo4;

public class demo5 {
	static int a=34;
	static int b=10;
public static void main(String[] args) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
	demo5 d=new demo5();
	d.Temp();
}
public void Temp()
{
int temp=a;
a=b;
b=temp;
System.out.println(temp+" "+a);
}
}
