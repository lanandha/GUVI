import java.util.*;
public class Swap {
  public static void main(String[]args){
	  String s;
	  int i,j;
	  Scanner sc= new Scanner(System.in);
	  s=sc.nextLine();
	  char ch[]=s.toCharArray();
	  int l=s.length();
	  for(i=0;i<l;i+=2){
		  //for(j=i+1;j<l;j++){
			  if(ch[i]%2==0){
				  char c1=ch[i];
					ch[i]=ch[i+1];
					ch[i+1]=c1;	  
			  }else{
				  char c1=ch[i];
					ch[i]=ch[i+1];
					ch[i+1]=c1;	
		  }
	  
	System.out.print(ch[i]+""+ch[i+1]);
  }}
}
