package Demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CoutingOccuranceOfLetter {
public static void main(String[] args) throws IOException {
	BufferedReader red=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter The String");
	String s=red.readLine();
	System.out.println("Enter The Characyer");
	char ch=(char) System.in.read();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	if(c==ch)
	{
	count++;
	}
	}
	System.out.println(s+" String contains charater "+ch+" "+count);
}
}
