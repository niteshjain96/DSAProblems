// Print Odd Even Till n

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int x=1;
		while(n>=x){
		    if(x%2==0){
		        System.out.println(x + " is Even");
		    }
		    else{
		        System.out.println(x + " is Odd");
		    }
		    x++;
		}
	}
}
