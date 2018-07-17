import java.util.*;
import java.lang.Math;
public class Mathabs {
public static void main(String[]args){
	int h1,m1,h2,m2,h,m,n,b;
	Scanner sc=new Scanner(System.in);
	h1=sc.nextInt();
	m1=sc.nextInt();
	h2=sc.nextInt();
	m2=sc.nextInt();
	h=h1-h2;
	m=m1-m2;
	n=Math.abs(h);
	b=Math.abs(m);
	System.out.println(n+" "+b);
}
}
