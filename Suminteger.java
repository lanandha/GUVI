import java.util.*;
public class Suminteger {
public static void main(String[]args){
	int i,a,s,b=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	s=sc.nextInt();
	int ar[]=new int[a];
	for(i=0;i<a;i++){
		ar[i]=sc.nextInt();
	}for(i=0;i<s;i++){
		b=b+ar[i];
	}
	System.out.println(b);
}
}
