import java.util.*;
public class Vowels {
  public static void main(String[]args){
	  String ss,s1="",s2="";
	  Scanner sc=new Scanner(System.in);
	  ss=sc.nextLine();
	  s1=ss.replaceAll("[a,e,i,o,u]", "");
	 int l=s1.length();
	  for(int i=l-1;i>=0;i--){
		  s2=s2+s1.charAt(i);
	  }
	  System.out.println(s2);
  }
}
