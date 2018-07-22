import java.util.*;
public class Set7 {
 public static void main(String[]args){
	 String a;
	 int z=0,y=0,i,j,c=0;
	 Scanner sc=new Scanner(System.in);
	 a=sc.next();
	 z=a.length();
	 char ch[]=new char[z];
	 ch=a.toCharArray();
	 for(i=0;i<z;i++){ 
		 if(ch[i]!=0)
		 for(j=i+1;j<z;j++){
		if(ch[j]!=0)
			 if(ch[i]==ch[j]){
				 ch[i]=0;ch[j]=0;
				 c++;
			 }
		 }
	 }
	 System.out.println(z-2*c);
 }
}
