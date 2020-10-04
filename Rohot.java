# wipro-PRP
Answers for wipro PRP programs.
public class Main
{
	public static void main(String[] args) {
		int a=3;
		int b=5;
		int g=0;
		String c="2-5-SW";
		String d="M r L l M m R M";
		String x[]=c.split("-");
		String y[]=d.split(" ");
	    int m=Integer.parseInt(x[0]);
	    int n=Integer.parseInt(x[1]);
	    String o=x[2];
	    for(int i=0;i<y.length;i++){
	  if((y[i].equals("R"))&&g!=1){
	            if(o.equals("NE")) o="SE";
	            else if (o.equals("N")) o="E";
	            else if (o.equals("E")) o="S";
	            else if(o.equals("SE")) o="SW";
	            else if(o.equals("S"))  o="W";
	            else if(o.equals("SW")) o="NW";
	            else if(o.equals("W"))  o="N";
	            else if(o.equals("NW")) o="NE";}
	   else if((y[i].equals("L"))&& g!=1){
	            if(o.equals("NE")) o="NW";
	            else if (o.equals("N")) o="W";
	            else if (o.equals("E")) o="N";
	            else if(o.equals("SE")) o="NE";
	            else if(o.equals("S"))  o="E";
	            else if(o.equals("SW")) o="SE";
	            else if(o.equals("W"))  o="S";
	            else if(o.equals("NW")) o="SW";}
	   else if((y[i].equals("r"))&& g!=1){
	            if(o.equals("NE")) o="E";
	            else if (o.equals("N")) o="NE";
	            else if (o.equals("E")) o="SE";
	            else if(o.equals("SE")) o="S";
	            else if(o.equals("S"))  o="SW";
	            else if(o.equals("SW")) o="W";
	            else if(o.equals("W"))  o="NW";
	            else if(o.equals("NW")) o="N";}
	   else if((y[i].equals("l"))&& g!=1){
	            if(o.equals("NE")) o="N";
	            else if (o.equals("N")) o="WE";
	            else if (o.equals("E")) o="NE";
	            else if(o.equals("SE")) o="E";
	            else if(o.equals("S"))  o="SE";
	            else if(o.equals("SW")) o="S";
	            else if(o.equals("W"))  o="SW";
	            else if(o.equals("NW")) o="W";}
	   else if (g!=1){
	    if(y[i].equals("M")){
	        if(o.equals("N")){
	       if(b-1>n) n=n+2; 
	       else g=1;}
        else if(o.equals("S")){
	       if(n>1) n=n-2; 
	       else g=1;}
	  else if(o.equals("E")){
	       if(a-1>m) m=m+2; 
	       else g=1;}
	    else if(o.equals("W")){
	       if(m>1) m=m-2; 
	       else g=1;}
	   else if(o.equals("NE")){
	       if(a-1>m && b-1>n){
	           m=m+2;
	           n=n+2;}
	       else {g=1;}}
	   else if(o.equals("NW")){
	       if(m>1 && b-1>n){ 
	       m=m-2; n=n+2;}
	       else{
	          g=1;} } 
	   else if(o.equals("SE")){
	       if(n>1 && a-1>m) {m=m+2; n=n-2;}
	       else {g=1;}
	   }
	   else if(o.equals("SW")){
	       if(m>1 && n>1) {m=m-2; n=n-2;}
	       else{ g=1;}
	   }}
	 else if(y[i].equals("m")){
	        if(o.equals("N")){
	       if(b>n) n=n+1; 
	       else g=1;}
        else if(o.equals("S")){
	       if(n>0) n=n-1; 
	       else g=1;}
	  else if(o.equals("E")){
	       if(a>m) m=m+1; 
	       else g=1;}
	    else if(o.equals("W")){
	       if(m>0) m=m-1; 
	       else g=1;}
	       else if(o.equals("NE")){
	       if(a>m && b>n)
	          { m=m+1;
	           n=n+1;}
	       else{ g=1;}}
	   else if(o.equals("NW")){
	       if(m>0 && b>n){ m=m-1; n=n+1;}
	       else {g=1;}  }
	   else if(o.equals("SE")){
	       if(n>0&& a>m) {m=m+1; n=n-1;}
	       else {g=1;}
	   }
	   else if(o.equals("SW")){
	       if(m>0 && b>0){ m=m-1; n=n-1;}
	       else {g=1;}}}
	   }}

if(g!=1)     
	       System.out.println(String.valueOf(m)+"-"+String.valueOf(n)+"-"+String.valueOf(o));
	 else
	      System.out.println(String.valueOf(m)+"-"+String.valueOf(n)+"-"+String.valueOf(o)+"-"+"ER");
	      
	    }}	    
