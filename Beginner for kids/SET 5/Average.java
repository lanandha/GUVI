import java.util.*;
public class Average {
	public static void main(String[]args){
		 int a,i,rem,sum=0;
		 Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 int arr[]=new int[a];
		 for(i=0;i<a;i++){
			 arr[i]=sc.nextInt();}
		 for(i=0;i<a;i++){
		 while(arr[i]!=0){
			 rem=arr[i]%10;
			 sum=sum+rem;
			 arr[i]=arr[i]/10;
		 }}
			 System.out.println(sum/a);
		 }
}
