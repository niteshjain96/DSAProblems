// Any Base to Decimal

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int dn=getValueInBase(n,b);
        System.out.print(dn);
    }
    
    public static int getValueInBase(int n,int b){
        int dn=0;
        int tp=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            dn=dn+r*tp;
            tp=tp*b;
        }
        return dn;
    }
}