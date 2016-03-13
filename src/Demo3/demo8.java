package Demo3;

public class demo8 extends Thread{
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t.getName());
	demo8 d=new demo8();
	Thread t1=new Thread(d);
	t1.run();
}
public void run()
{
	for(int i=0;i<15;i++)
	{
		System.out.println("theread is running");
	}
}
}
