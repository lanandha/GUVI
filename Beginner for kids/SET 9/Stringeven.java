import java.util.*;
public class Stringeven {
 public static void main(String[]args){
	
	 	 String a,b="",c="",d;
	 	    int z,x1=0,f1=0,y=0,x=0,i,e=0,f=0,g=0,e1=0;
	 	    char j;
	 	    Scanner sc=new Scanner(System.in);
	 	    a=sc.next();
	 	    x=a.length();
	 	    for(i=0;i<x;i=i+2){
              System.out.print(a.charAt(i));
              //System.out.println("\n");
	 	    }
	 	    System.out.print(" ");
	 	   for(i=1;i<x;i=i+2){
	              System.out.print(a.charAt(i));
	             
		 	    }
	 }
	 
}
