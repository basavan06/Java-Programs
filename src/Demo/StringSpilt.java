package Demo;

public class StringSpilt {
public static void main(String[] args) {
	String str="012ab567ab0123ab";
    String delemeter="ab";
    String result[]=mySplit(str,delemeter);
    for(String s:result)
        System.out.println(s);
}
public static String[] mySplit(String text,String delemeter){
    java.util.List<String> parts = new java.util.ArrayList<String>();
    text+=delemeter;        

    for (int i = text.indexOf(delemeter), j=0; i != -1;) {
        parts.add(text.substring(j,i));
        j=i+delemeter.length();
        i = text.indexOf(delemeter,j);
    }


    return parts.toArray(new String[0]);
}
}