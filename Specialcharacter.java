import java.util.*;
public class Specialcharacter {
public static void main(String[]args){
	int i,a=0;
	String s,b="";
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	b=(s.replaceAll("[^!,@,#,$,%,^,&,*,(,)]",""));
	System.out.println(b.length());	
}
}
