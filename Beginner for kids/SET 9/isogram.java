import java.util.*;
public class isogram {
  public static void main(String[]args){
	  String a,z="";
	  int b,c=0,i,d=0,c1=0,j,c2=0;
Scanner sc=new Scanner(System.in);
a=sc.next();
b=sc.nextInt();
z=Integer.toString(b);
d=z.length();
int arr[]=new int[d];
for(i=0;i<d;i++){
	arr[i]=Integer.parseInt(String.valueOf(z.charAt(i)));
}
c=a.length();
for(i=0;i<c;i++){
	for(j=i+1;j<c;j++){
		if(a.charAt(i)==a.charAt(j)){
			c2++;
			break;
		}
	}
}
for(i=0;i<d;i++){
	for(j=i+1;j<d;j++){
		if(arr[i]==arr[j]){
			c1++;
			break;
		}
  }
}
if(c2==0){
	System.out.println(a+" yes");
}
else{
	System.out.println(a+" no");
}
if(c1==0){
	System.out.println(b+" yes");
}
else{
	System.out.println(b+" no");
}
  }
}
