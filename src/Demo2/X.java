package Demo2;

public class X {
  public void methodA() //Base class method
 {
  System.out.println ("hello, I'm methodA of class X");
  }
public class Y extends X
{
public void methodA() //Derived Class method
{
 System.out.println ("hello, I'm methodA of class Y");
 }
}
}