import java.util.*;
public class Binarynumber {
 public static void main(String[]args){
	 String a;
	 Scanner sc =new Scanner(System.in);
	 a=sc.next();
	 a=a.replaceAll("1","");
     a=a.replaceAll("0","");
if(a.length()==0)
{
	System.out.println("yes");
}
else{
	System.out.println("No");
}
 }
}
