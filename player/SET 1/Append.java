import java.util.*;
public class Append {
  public static  void main(String[]args){
	  String s;Scanner sc=new Scanner(System.in);
	  s=sc.nextLine();
	  StringBuffer ss=new StringBuffer(s);
	  ss.append("kk");
	  System.out.println(ss);
  }
}
