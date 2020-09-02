# wipro-PRP
Answers for wipro PRP programs.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String a="saoyi";
		String b="RajiV";
		int s=786546;
		String z=String.valueOf(s);
		int d=4;
		String r="";
		String res="";
		if(a.length()<b.length()){
		res+=(a.substring(a.length()-1,a.length())+b);
	}		
	  else if(a.length()>b.length()){
	      res+=(b.substring(b.length()-1,b.length())+a);
	      }
	  else{
	     String c[]={a,b};
	     Arrays.sort(c);
	     res+=(c[0].substring(c[0].length()-1,c[0].length())+c[1]);
	  }
	  for(int i=0;i<res.length();i++){
	      char e=res.charAt(i);
	      if(e>='A'&& e<='Z'){ r+=res.substring(i,i+1).toLowerCase();}
	      else if(e>='a'&& e<='z'){ r+=res.substring(i,i+1).toUpperCase();}
	  }
	  String h=z.substring(d-1,d);
	  String k=new StringBuilder(z).reverse().toString();
	  String j=k.substring(d-1,d);
	  System.out.println(r+h+j);
	}
}

