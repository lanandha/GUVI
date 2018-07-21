import java.util.*;
public class Primenumber {
  public static void main(String[]args){
  int a,i,m=0,n=0,flag=0;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  m=a/2;
  if(a==0||a==1){
	  System.out.println("not prime number");		  
  }else{
	  for(i=2;i<m;i++){
		  if(n/i==0){
			  System.out.println("not prime number");
		  flag=1;
		  }
		  }
	  if(flag==0)
	  {
		  System.out.println("yes");
	  }
		  
	  }
  }
}
