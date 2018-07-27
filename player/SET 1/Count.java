import java.util.*;
public class Count {
  public static void main(String[]args){
	  int i,j,c=0,c1=0;
	  
	  String s,sa;
	  Scanner sc=new Scanner(System.in);
	  s=sc.nextLine();
	  char ch[]=s.toCharArray();
int o=ch.length;
	
	  sa=sc.nextLine();
	  char[] cc=sa.toCharArray();
	  int n=cc.length;
	
	  for(i=0;i<o;i++){
		  for(j=i+1;j<o;j++){
			  if(ch[i]==ch[j]){
				 c++; 
				 break;
			  }
		  }
	  }for(i=0;i<n;i++){
		  for(j=i+1;j<n;j++){
			  if(cc[i]==cc[j]){
				 c1++; 
				 break;
			  }
		  }
	  }
	  System.out.println(c+""+c1);
	  if(c>0 && c1>0){
		  System.out.println("Yes");
	  }else{
		  System.out.println("no");
	  }
  }
}
