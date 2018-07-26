import java.util.*;
public class Mod {
  public static void main(String[]args){
	  int a,b,c,d=0;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
	  d=(a*b)%c;
	  System.out.println(d);
  }
}
