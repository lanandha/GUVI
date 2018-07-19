import java.util.*;
public class bitwise {
	public static void main(String[]args){
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
