import java.util.*;
public class Sumalldigits {
 public static void main(String[]args){
	int a,b,sum=0;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 while(a>0){
		 b=a%10;
		 sum=sum+b;
		 a=a/10;
		 
	 }
	 System.out.println(sum);
 }
}
