import java.util.*;
public class Naturals {
public static void main(String[]args){
	int i,a,b=0;
	Scanner sc=new Scanner (System.in);
	a=sc.nextInt();
	for(i=1;i<=a;i++){
		b=b+i;
		//System.out.println(i);
	}
	System.out.println(b);
}
}
