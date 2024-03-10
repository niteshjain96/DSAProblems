// print digits of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int temp=n;
		int div=1;
		while(temp>=10){
		    temp=temp/10;
		    div*=10;
		}
		while(div>=1){
		    int q=n/div;
		    int rem=n%div;
		    System.out.println(q);
		    n=rem;
		    div=div/10;
		    
		}
	}
}
