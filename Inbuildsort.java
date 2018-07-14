import java.util.*;
public class Inbuildsort {
public static void main(String[] args){
	int q,temp,n,c=0;
	Scanner sc=new  Scanner(System.in);
	n=sc.nextInt();
	temp=n;
	while(n>0){
		q=n%10;
		n=n/10;
		c=c+(q*q*q);
	}
	if(temp==c){
		
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}