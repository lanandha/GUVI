import java.util.*;
public class Position {
public static void main(String[]args){
	int i,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();}
	for(i=0;i<n;i++){
	System.out.println(a[i]+" "+i);
}}
}
