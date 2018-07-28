import java.util.*;
public class Count1 {
  public static void main(String[]args){
	  int a,b,i,j,c=0,c1=0;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  for(i=a;i<b;i++){
		  c=0;
			for(j=2;j<=i;j++){
				if(i%j==0){
					c++;
				}
	  }
			if(c==1){
				c1++;
			}
	  }System.out.println(c1);
  }
}
