# wipro-PRP
Answers for wipro PRP programs.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={10,9,8,7,6,5,4,3,2,1};
	    int b=10;
	int sum=a[0]+a[1];
	for(int i=2;i<a.length;i++){
	    for(int j=2;j<=Math.sqrt(i);j++){
	        if(i%j==0 && i!=j){
	            sum+=a[i];
	        }
	    }
	}
	System.out.println(sum);
	}}
