import java.util.Scanner;
public class summm {
public static void main(String[] args) {
	int a,b=0,c=0,i;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(i=1;i<=a;i++){
		b=b+i;
	}
	System.out.println(b);
}
}
