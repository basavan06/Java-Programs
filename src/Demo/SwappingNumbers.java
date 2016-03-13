package Demo;

public class SwappingNumbers {
public static void main(String[] args) {
	int a=10;
	int b=30;
	System.out.println("Before Swapping Numbers are "+a+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping Numbers are "+a+" "+b);
}
}
