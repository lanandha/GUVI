import java.util.*;
public class factors {
  public static void main(String[]args){
	  int n,m,i;
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	   for(i=1;i<n;i++){
		   if(n%i==0){
			   System.out.println(i);
		   }
	   }
  }
}