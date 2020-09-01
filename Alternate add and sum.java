# wipro-PRP
Answers for wipro PRP programs.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int s1=0;int s2=0;
		int input1=7,input2=1;
		if (input2==1){
	    for(int i=input1;i>0;i=i-2)
	    {
	        s1+=i;
	        s2+=i-1;
	    }
    System.out.println(s1-s2);
		}
	else if (input2==2){
	    for(int i=input1-1;i>0;i=i-2)
	    {
	        s1+=i;
            s2+=i-1;
	    }
	System.out.println((s1-s2)+input1);
	}
	
}
}
