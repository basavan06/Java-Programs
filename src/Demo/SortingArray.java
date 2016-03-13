
package Demo;

import java.util.Arrays;

public class SortingArray {
public static void main(String[] args) {
	int[]a={5,4,6,1,9,6,8,2};
	Arrays.sort(a);
	int[]b=a;
	for(int i=0;i<b.length;i++)
	{
	System.out.println("Numbers are:-"+b[i]);
}
}
}
