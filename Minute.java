import java.util.*;
public class Minute {
public static void main(String[]args){
	int min,rem,hr;
	Scanner sc=new Scanner(System.in);
	min=sc.nextInt();
	hr=min/60;
	rem=min-(60*hr);
	System.out.println(hr+""+rem);
}
}
