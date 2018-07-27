import java.util.*;
public class ReverseNumber {
 public static void main(String[]args){
	 int a,rem = 0,s=0,m=0;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 while(a>0){
		 rem=a%10;
s=s*10+rem;
a=a/10;
	 }
	 System.out.println(s);
		
 }
}
