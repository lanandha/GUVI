import java.util.*;
public class captial {
 public static void main(String[]args){
	 String a;
	 int i;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextLine();
	 String b[]=a.split("\\s");
	 for(i=0;i<b.length;i++){
		 b[i]=b[i].substring(0,1).toUpperCase()+b[i].substring(1);
		 System.out.print(b[i]+" ");
	 }
 }
}
