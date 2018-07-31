import java.util.*;
public class Two {
 public static void main(String[]args){
	 Scanner sc= new Scanner(System.in);
	 Scanner sc1= new Scanner(System.in);
	 String q,as="",b="",as1="";
int i,j,p,s;
	 s=sc.nextInt();
     p=sc.nextInt();
	 String ss[]=new String[s];
	 for(i=0;i<s;i++){
		 ss[i]=sc1.next();
		 b=b+ss[i];
	 }
	  as=b.substring(s-p,s);
	  as1=b.substring(0,s-p);
	System.out.println(as+""+as1);
}
 }
