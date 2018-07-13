import java.util.*;
public class ODD {
public static void main(String[]args){
	int a;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a%2==0){
		System.out.println("Even");
	}else if(a%2!=0){
		System.out.println("odd");
	}else{
		System.out.println("invalid");
	}
}
}
