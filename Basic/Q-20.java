// Pattern 3
//                  * 
//              *   *
//          *   *   *
//      *   *   *   *
//  *   *   *   *   *

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nsp=n-1,nst=1;
		for(int r=1;r<=n;r++){
		    for(int i=1;i<=nsp;i++){
		        System.out.print("\t");
		    }
		    for(int j=1;j<=nst;j++){
		        System.out.print("*\t");
		    }
		    System.out.println();
		    nst++;
		    nsp--;
		}
		
	}
}
