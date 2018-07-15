import java.util.*;
public class Smallest {
public static void main(String[]args){
		int i,b,max;
		Scanner in=new Scanner(System.in);
		//System.out.println("Enter the Three number:");
		b=in.nextInt();
		int a[]=new int[b];
		for( i=0;i<b;i++){
			a[i]=in.nextInt();
		}Arrays.sort(a);
		
			System.out.println(a[0]);
		}
}