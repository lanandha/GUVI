import java.util.*;
public class repeatingsnumber {
 public static void main(String[]args){
	 int a,b,c=0,i;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 int arr[]=new int[a];
	 for(i=0;i<a;i++){
		 arr[i]=sc.nextInt();
	 }
	 for(i=0;i<a;i++){
		 if(arr[i]==b){
		c++;
		break;
		 }
	 }if(c==1){
			 System.out.println("yes");
		 }else{
			 System.out.println("no");
		 }

 }
}
