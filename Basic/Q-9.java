// Print Fibonacci Series till N

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++){
		    int c=a+b;
		    System.out.print(a+ "  ");
		    a=b;
		    b=c;
		}
		
	}
}
