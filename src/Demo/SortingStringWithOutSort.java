package Demo;

public class SortingStringWithOutSort {
	public static void main(String[] args) {
		String original = "edclsyrba";
		char temp=0;
		 char[] chars = original.toCharArray();
		 
		System.out.println("before sorting");
		for(int k=0;k<chars.length;k++){
			System.out.print(chars[k]+" ");
		}
		
		System.out.println();
		for (int i = 0; i <chars.length; i++) {
			for ( int j = i; j < chars.length; j++) {
				if(chars[j]<chars[i]){
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			} 
			System.out.println("after iteration:"+i);
			for(int x=0;x<chars.length;x++)
				System.out.print(chars[x]+" ");
			System.out.println();
			
		}
		System.out.println("after sorting");
		for(int k=0;k<chars.length;k++){
			System.out.print(chars[k]+" ");
		}
	}

}
