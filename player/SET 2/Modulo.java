import java.util.*;
public class Modulo {
  public static void main(String[]args){
	  int s,b;
	  int i;
	  Scanner sc=new Scanner(System.in);
	  s=sc.nextInt();
	  b=sc.nextInt();
	  for(i=1;i<999;i++){
		  if(i%1==0 && i%b==0){
		System.out.println(i);break;	  
		  }
	  }
  }
}
