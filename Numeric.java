import java.util.*;
public class Numeric {
public static void main(String[]args){
	int i,a=0;
	String s,b="";
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	b=(s.replaceAll("[^0-9]",""));
	System.out.println(b.length());	
}
}
