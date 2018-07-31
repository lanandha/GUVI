import java.util.*;
public class repeat {
  public static void main(String[]args){
	  int s,b,n;
	  int i,count=0;
	  Scanner in=new Scanner(System.in);
	  n=in.nextInt();
	  String str[]=new String[n];
	  for(i=0;i<n;i++){
	  	str[i]=in.next();
	  }
	  for(i=0;i<n;i++){
	  	char ch[]=str[i].toLowerCase().toCharArray();Arrays.sort(ch);
	  	for(int j=1;j<n;j++){
	  		char ch1[]=str[j].toLowerCase().toCharArray();Arrays.sort(ch1);
	  		if(Arrays.equals(ch,ch1)){
	  			count=1;
	  		}
	  	}
	  	count=count+count;
	  	}
	  System.out.println(count+1);
	  }
  }

