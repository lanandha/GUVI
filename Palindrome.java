import java.util.*;
public class Palindrome {
public static void main(String[]args){
	int a,r,c=0;
	Scanner sc=new Scanner (System.in);
	a=sc.nextInt();
	int temp=a;
	while(a>0){
	r=a%10;
	c=r+(10*c);
	a=a/10;
	}
	System.out.println(c);
	if(c==temp){
	System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
}
}
