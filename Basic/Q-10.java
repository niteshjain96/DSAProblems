// Count digits of Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int count=0;
		while(n!=0){
		    int quotient=n/10;
		    int rem=n%10;
		    n=quotient;
		    count++;
		}
		System.out.println(count);
	}
}
