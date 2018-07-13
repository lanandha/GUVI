import java.util.Scanner;
public class Prime {
public static void main(String[] args){
	int n,i,a=0;
	Scanner ss= new Scanner(System.in);
	n= ss.nextInt();
	for(i=1;i<=n;i++){
		if(n%i==0){
			a++;
		}}
	if(a==2){
		System.out.println("prime");
	}
	else{
		System.out.println("no prime");
		
	}}}
	
	


