import java.util.*;
public class vowels {
public static void main(String[]args){
	char ch;
	Scanner sc=new Scanner (System.in);
	ch=sc.next().toLowerCase().charAt(0);
	if(ch>=97&&ch<=122){
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	System.out.println("Yes");
	}else{
		System.out.println("No");
	}}
	else{
		System.out.println("No");
	}

}
}
