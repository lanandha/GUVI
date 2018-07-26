import java.util.*;
public class Rever {
  public static void main(String[]args){
	  int a,rem,sum=0;
	  Scanner sc= new Scanner(System.in);
	  a=sc.nextInt();
	  while(a>0){
		  rem=a%10;
		  a/=10;
		  System.out.print(a);	  
	  }
  }
}
