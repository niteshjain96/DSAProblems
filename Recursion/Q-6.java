// Power-Logarithmic

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=powerlogarithmic(x,n);
        System.out.println(ans);
    }

    public static int powerlogarithmic(int x,int n){
        if(n==0){
            return 1;
        }
        int xpb2=powerlogarithmic(x,n/2);
        int xpn=xpb2*xpb2;
        if(n%2==1){
            xpn *=x;
        }
        return xpn;
    }
}