import java.util.*;
public class Positons {
public static void main(String[]args){
		int i,b,n;
		Scanner in=new Scanner(System.in);
		b=in.nextInt();
		int a[]=new int[b];
		for( i=0;i<b;i++){
			a[i]=in.nextInt();
		}Arrays.sort(a);
		
			System.out.println(a.length-1);
		}
}

