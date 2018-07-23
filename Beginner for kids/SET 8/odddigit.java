import java.util.*;
public class odddigit {
   public static void main(String[]args){
	  String a;
	  int i,j;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextLine();
	int len=a.length();
	  char c;
	  for(i=0;i<len;i++){
		  c=(a.charAt(i));
		 if(c%2!=0){
			 System.out.print(c);
		 }
		  }
	  }}
 
