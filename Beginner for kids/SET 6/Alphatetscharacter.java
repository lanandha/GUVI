import java.util.*;
public class Alphatetscharacter {
 public static void main(String[]args){
	 String a;
	 int i,b=0,v;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextLine();
	 //b=sc.nextInt();
	 char ch[]=a.toCharArray();
	 int len=ch.length;
	 for(i=0;i<len;i++){
		 if(ch[i]>'a'&&ch[i]<'z'||ch[i]>'A'&&ch[i]>'Z'||ch[i]>'0'&&ch[i]<'9'){
			 b=1;
		 } }if(b==1){
			 
				 System.out.println("yes");
			 }
			 else {
				 System.out.println("no");
			 }
		 }
	 
	 }
 

