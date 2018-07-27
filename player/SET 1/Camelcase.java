import java.util.Scanner;

public class Camelcase {
	public static void main(String[]args){
		  String s,ss;
		  int i,j;
		  Scanner sc= new Scanner(System.in);
		  s=sc.nextLine();
		  ss=sc.nextLine();
		  String s1=s.substring(0,1).toUpperCase()+s.substring(1);
		  String s2=ss.substring(0,1).toUpperCase()+s.substring(1);
		  System.out.println(s1);
		  System.out.println(s2);
		 
}
}
