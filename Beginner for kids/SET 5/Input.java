import java.util.*;
public class Input {
 public static void main(String[]args){
	String a,b;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextLine();
	 b=a.replaceAll("[^0-9]","");
	 int s=a.length();
	 System.out.println(s);
 }
}
