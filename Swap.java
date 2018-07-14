import java.util.Scanner;
import java.util.*;
public class Swap {
public static void main(String[]args)	{		
	       int n,b,i =0,c=0;
	       int num =0;
	       Scanner ss= new Scanner(System.in);
	   	n= ss.nextInt();
	  b=ss.nextInt();
	   	//String prime="";
	   	c=n+1;
	       String  primeNumbers = "";

	       for (i = n; i <= b; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=n; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}