import java.util.*;
public class Factorial {
public static void main(String[]args){
	int a,fact=1;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(int i=1;i<=a;i++){
		fact=fact*i;
	}System.out.println(fact);
}
}
