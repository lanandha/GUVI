import java.util.*;
public class Givennumbers {
  public static void main(String[]args){
	  int a,b,c;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
	  if(a>b&&a<c){
		  System.out.println("yes");
	  }else{
		  System.out.println("no");
	  }
  }
}
