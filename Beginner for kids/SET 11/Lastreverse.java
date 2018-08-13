import java.util.*;
public class Lastreverse {
 public static void main(String[]args){
	 String a;
	 Scanner sc =new Scanner(System.in);
	 a=sc.nextLine();
	 int l=a.length();
	 int b;
	 b=sc.nextInt();
	 System.out.println(a.substring(l-b,l));
 }
}
