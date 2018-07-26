import java.util.*;
public class Last {
	public static void main(String[]args){
		String s;
		int i,a;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		a=sc.nextInt();
		String ss[]=s.split("");
		int l=ss.length;
		
			System.out.println(ss[l-a]);
		
	}

}
