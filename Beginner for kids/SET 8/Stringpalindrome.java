import java.util.*;
public class Stringpalindrome {
  public static void main(String[]args){
	  String s;
	  
	  Scanner sc=new Scanner(System.in);
	  s=sc.next();
	  StringBuffer ss=new StringBuffer(s);
	  ss.reverse();
	  String s1=ss.toString();
	  System.out.println(ss);
	  if(s.equals(s1)){
		  System.out.println("palindrome");
	  }
	  else{
		  System.out.println("not palindrome");
	  }
	  
  }
}
