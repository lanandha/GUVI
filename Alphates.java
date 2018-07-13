import java.util.*;
public class Alphates {
	public static void main(String[]args){
		char ch;
		Scanner sc=new Scanner (System.in);
		ch=sc.next().toLowerCase().charAt(0);
		if(ch>=97&&ch<=122){
		System.out.println("yes");
		}else{
			System.out.println("No");
		}

	}
}
