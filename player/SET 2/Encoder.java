import java.util.*;
public class Encoder {
 public static void main(String[]args){
	 String s;
	 int i;
	 Scanner sc=new Scanner(System.in);
	 s=sc.nextLine();
	 for(i=0;i<s.length();i++){
		 char ch=s.charAt(i);
	 
	 int b=(int)ch;
	 b=b+3;
	 System.out.print((char)b);
 }}
}
