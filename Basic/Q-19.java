// Pattern 2
//     * * * * *
//     * * * * 
//     * * *
//     * *
//     *


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n,nsp=0;
		for(int r=1;r<=n;r++){
		    System.out.print(r);
		    for(int i=1;i<=nst;i++){
		        System.out.print(i+" ");
                System.out.print("*\t");
            }
            System.out.println();
            nst--;
		    
		}
		
	}
}
