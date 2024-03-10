// Pythagoren Triplet

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		boolean pythagoren=true;
		if(a> b && a>c){
		    if(a*a == b*b + c*c){
		        pythagoren=true;
		        
		    }
		    else{
		        pythagoren=false;
		       
		    }
		}
		else if(b>a && b>c){
		    if(b*b == a*a + c*c){
		        pythagoren=true;
		       
		    }
		    else{
		        pythagoren=false;
		        
		    }
		}
		else{
		    if(c*c == a*a + b*b){
		        pythagoren=true;
		        
		    }
		    else{
		        pythagoren=false;
		        
		    }
		}
		if(pythagoren){
		    System.out.print("Pythagoren Triplet");
		}
		else{
		    System.out.print("Not a Pythagorean Triplet");
		}
		
	}
}
