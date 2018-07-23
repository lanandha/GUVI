import java.util.*;
public class Perfectsquare {
  public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  int m=sc.nextInt();
	  int n=sc.nextInt();
	  int o=(int)Math.sqrt(m*n);
	  if((o*o) == (m*n)){
		  System.out.print("yes");
	  }
	  else{
		  System.out.println("no");
	  }
  }
}
