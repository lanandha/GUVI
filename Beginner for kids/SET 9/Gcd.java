import java.util.*;
public class Gcd {
  public static void main(String[]args){
	 int n,i,n1,gcd=0;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 n1=sc.nextInt();
	 for(i=1;i<n&&i<n1;++i){
		 if(n%i==0 && n1%i==0){
			 gcd=i;
		 }}
		 System.out.println(gcd);
	 
  }
}
