// Pattern 15
//          1
//      2   3   2
//  3   4   5   3   2
//      2   3   2
//          1

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nsp=n/2,nst=1;
        int val=1;
		for(int r=1;r<=n;r++){
		    for(int i=1;i<=nsp;i++){
		        System.out.print("\t");
		    }
		    int ival=val;
            for(int j=1;j<=nst;j++){
		        System.out.print(ival+"\t");
		        if(j<=nst/2){
		            
		        ival++;
		        }
		        else{
		            ival--;
		        }
		    }
		    if(r<=n/2){
		        val++;
		    }
		    else{
		        val--;
		    }
            if(r<=n/2){
                nst+=2;
                nsp--;
            }
		    else{
		    nst-=2;
		    nsp++;  
		    }
		    System.out.println(); 
		}
	}
}



