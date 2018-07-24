import java.util.*;
public class Numbs {
  public static void main(String[]args){
	  String s;
	  Scanner sc=new Scanner(System.in);
	  s=sc.nextLine();
	  String as=s.replaceAll("[^0-9]","");
	  System.out.println(as);
  }
}
