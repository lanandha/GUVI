import java.util.*;
public class products {
 public static void main(String[]args){
	 int a,rem,p=1;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 while(a>0){
		 rem=a%10;
		 p=p*rem;
		 a=a/10;
	 }System.out.println(p);
 }
}
