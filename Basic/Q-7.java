// Is a Number Prime
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
	    int div=2;
	    boolean isprime=true;
	    while(div*div<=n){
	        int rem=n%div;
	        if(rem==0){
	            isprime=false;
	            break;
	        }
	        div++;
	    }
	    if(isprime){
	        System.out.println("Number is Prime");
	    }
	    else{
	        System.out.println("Number is Not Prime");
	    }
		
	}
}


