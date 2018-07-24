import java.util.*;
public class Lcm {
  public static void main(String[]args){
	 int n,i,n1,lcm=0;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 n1=sc.nextInt();
	 lcm=n>n1?n:n1;
	 while(true){
		 if(lcm%n==0 && lcm%n1==0){
			 //lcm=i;
			 System.out.println(lcm);
		 break;
		 }
		 ++lcm;
		 }
	 
  }
}
