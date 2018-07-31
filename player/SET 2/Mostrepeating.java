import java.util.*;
public class Mostrepeating {
  public static void main(String[]args){
	  String s;
	  int i,j,c=0;
	  char r=' ';
	  Scanner sc=new Scanner(System.in);
	  s=sc.nextLine();
	  int max=0;
	  int l=s.length();
	  for(i=0;i<l;i++){
		  for(j=i+1;j<l;j++){
			 if(s.charAt(i)==s.charAt(j)){
				 c++;
			 } }
		  if(c>max){
				 max=c;
				
				 r=s.charAt(i);}
				 //c=0;
			 }
		  
	  System.out.println(r);
  }
}
