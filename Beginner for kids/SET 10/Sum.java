import java.util.*;
public class Sum {
  public static void main(String[]args){
	  int rem,i,a,sum=0;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  int[] arr=new int[a];
  for(i=0;i<a;i++){
     arr[i]=sc.nextInt();
     sum=sum+arr[i];}
     System.out.println(sum);
  }
  
 
  
}
