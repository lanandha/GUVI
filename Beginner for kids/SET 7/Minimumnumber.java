import java.util.*;
public class Minimumnumber {
 public static void main(String[]args){
 int a,i;
 Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		int arr[]=new int[a];

 for(i=0;i<a;i++){
	 arr[i]=sc.nextInt();
 }
 Arrays.sort(arr);
	 System.out.print(arr[0]+" ");
 }
 }
 
