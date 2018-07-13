import java.util.*;
public class Leapyear {
	public static void main(String[]args){
int n;
Scanner b=new Scanner(System.in);
n=b.nextInt();
if(n%4==0){
	if(n%100==0){
		if(n%400==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}}else{
			System.out.println("yes");
		}}
		else{
			System.out.println("no");
		}
	

	}

}
