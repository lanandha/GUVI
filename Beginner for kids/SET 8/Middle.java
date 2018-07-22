import java.util.*;
public class Middle {
  public static void main(String[]args){
	  String a,b,d;
	  int c,e;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextLine();
	  int l=a.length();
	  if(l%2==0){
		  c=l/2;
		  b=a.substring(c-1, c+1);
		  d=a.replaceAll(b,"**");
		  System.out.println(d);
	  }else{
		  
		  //System.out.println(e);
		  c=l/2+1;
		  b=a.substring(c-1,c);
		  d=a.replaceAll(b,"*");
		  System.out.println(d);
	  }
  }
}
