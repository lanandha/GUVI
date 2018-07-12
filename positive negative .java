import java.util.*;
public class Postive {
public static void main(String[]args){
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n==0){
		System.out.println("zero");
	}
	else if(n>=1){
		System.out.println("positive");
	}else{
		System.out.println("Negative");
	}
}
}
