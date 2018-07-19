import java.util.*;
public class InbuildAmstrong {
public static void main(String[] args){
	int q,i,n,s,temp,c;
	Scanner sc=new  Scanner(System.in);
	n=sc.nextInt();
	s=sc.nextInt();
	for(i=n;i<s;i++){
		temp=i;c=0;
	while(temp!=0){
		q=temp%10;
		temp=temp/10;
		c=c+(q*q*q);
	}
	if(c==i)
		
			System.out.println(c);
		}}
	}
