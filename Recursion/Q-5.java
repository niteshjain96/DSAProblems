// Power-linear

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=powerlinear(x,n);
        System.out.println(ans);
    }

    public static int powerlinear(int x, int n){
        if(n==0){
            return 1;
        }
        int ans=x*powerlinear(x,n-1);
        return ans;
    }
}