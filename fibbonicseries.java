import java.util.*;
public class fibbonicseries {
public static void main(String[]args){
	int i,a,t1=1,t2=1,sum=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(i=1;i<=a;++i){
		System.out.print(t1+" ");
		sum=t1+t2;
		t1=t2;
		t2=sum;
	}
}
}
