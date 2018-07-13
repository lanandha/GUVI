import java.lang.reflect.Array;
import java.util.*;
public class Largestnumber {
public static void main(String[]args){
	int i,b,max;
	Scanner in=new Scanner(System.in);
	//System.out.println("Enter the Three number:");
	b=in.nextInt();
	int a[]=new int[b];
	for( i=0;i<b;i++){
		a[i]=in.nextInt();
	}Arrays.sort(a);
	if(a[0]<0){
		System.out.println("in");
	}else if(a[b-1]>0){
		System.out.println(a[b-1]);
	}else{
		System.out.println("yes");
	
	}
}
}
