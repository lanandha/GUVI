import java.util.*;
public class Validatenumeric {
public static void main(String[]args){
	String a;
	Scanner sc=new Scanner(System.in);
	a=sc.nextLine();
	try{
		Integer.parseInt(a);
		System.out.println("yes");
	}catch(NumberFormatException e){
System.out.println("no");		
	}
}
}
