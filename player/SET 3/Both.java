import java.util.*;
public class Both {
 public static void main(String[]args){
	 int a,b,i,t=0;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 for(i=1;i<=a;i++){
		 if(a%i==0 && b%i==0){
			 t=i;
		 }
	 }System.out.println(t);
 }
}
