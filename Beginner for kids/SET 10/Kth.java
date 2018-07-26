import java.util.*;
public class Kth {
  public static void main(String[]args){
	  int a,i,b,c=0;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  int arr[]=new int[a];
  for(i=0;i<a;i++){
	  arr[i]=sc.nextInt();
  }
  for(i=0;i<a;i++){
  if(b==i){
	  System.out.println(arr[i-1]);
  }}
	  
  
  }
}
