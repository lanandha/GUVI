import java.util.*;
public class Length {
public static void main(String[]args){
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	String ss=s.replaceAll(" ","");
	int n=ss.length();
	System.out.println(n);
}
}
