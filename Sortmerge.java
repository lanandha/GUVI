import java.util.*;
public class Sortmerge {
public static void main(String[]args){
		int i,b,n;
		Scanner in=new Scanner(System.in);
		b=in.nextInt();
		int a[]=new int[b];
		for( i=0;i<b;i++){
			a[i]=in.nextInt();
		}Arrays.sort(a);
		for( i=0;i<b;i++){
			System.out.print(a[i]+" ");
		}
}
}
