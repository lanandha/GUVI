import java.util.*;
public class Inbuildoddnumber {
public static void main(String[]args){
	int a,b,i;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	for(i=a+1;i<b;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
	
}
}
