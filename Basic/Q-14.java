// Rotate a Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int temp=n;
		int count=0;
		while(temp!=0){
		    temp=temp/10;
		    count++;
		}
		int div=1;
		int mult=1;
		int ans=0;
		k=k%count;
		if(k<0){
		    k=k+count;
		}
		for(int i=1;i<=count;i++){
		    if(i<=k){
		        div=div*10;
		    }
		    else{
		        mult *=10;
		    }
		}
		
	    int quotient=n/div;
	    int rem=n%div;
	    ans= rem*mult + quotient;
	    System.out.print(ans);
	    }
}
