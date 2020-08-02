# wipro-PRP
#keyvalue pair
#(thousand element of input1*hundred element of input2)+(minimium element  of input3)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int input1=3521;
	    int input2=2452;
	    int input3=1352;
	    int a=input1/1000;
	    int b=(input2/100)%10;
	    ArrayList<Integer> l=new ArrayList<>();
	    while(input3>0){
	        int c=input3%10;
	        l.add(c);
	        input3=input3/10;
	         }
	       int d=Collections.min(l);
		System.out.println((a*b)+d);
	}
}








3
