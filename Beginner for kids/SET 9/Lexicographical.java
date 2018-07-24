import java.util.*;
public class Lexicographical {
 public static void main(String[]args){
	 String a;
	 char ch[]=new char[100];
	 Scanner sc=new Scanner(System.in);
	 a=sc.next();
	 int i;
	 ch=a.toCharArray();
	 Arrays.sort(ch);
	 for(i=0;i<ch.length;i++){
		 System.out.print(ch[i]);
	 }
 }
}
