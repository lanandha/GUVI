import java.util.*;
public class Composite {
 //public static void main(String[]args){
	 int n,i,j,flag;
	    Composite()
	      {
	        System.out.print("Enter range to find the composite numbers: ");
	        Scanner in=new Scanner(System.in);
	        n=in.nextInt();
	        for(i=2;i<=n;i++ )
	         {
	             flag=0;
	            for(j=2;j<i;j++)
	              {
	                  if(i % j == 0)
	                     flag++;
	              }}
	            if(flag!=0)
	             System.out.println("yes");
	            else
	            	System.out.println("no");
	         
	     }
	 public static void main(String args[])    
	       {
	            Composite ob=new Composite();
	       }
	 }
