import java.util.*;
import java.util.Scanner;
public class Arithmatic {
	public static void main(String[] args) {
	int a,i,j,c=0,sum=0;
	Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			int arr[]=new int[a];
       
	for(i=0;i<a;i++){
		arr[i]=sc.nextInt();
	}Arrays.sort(arr);
	for(i=0;i<a-1;i++){
		if(arr[i]==arr[i+1]){
			c++;		
		}
	}
      	for(i=1;i<=arr[a-1];i++){
					sum=sum+i;
				}
      	if(c==0){
						System.out.println(sum+1);
			}
      	else{
      		System.out.println(sum);
      	}
	}
	}


