import java.util.*;
public class Coun {
 public static void main(String[]args){
	 int a,rem,c=0,sum=0;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 while(a>0){
		 rem=a%10;
		 sum=sum+rem;
a=a/10;
c++;
	 }
	 System.out.println(c);
	 
 }
}
