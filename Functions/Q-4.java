// Any Base to Any Base

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        int dn=anybasetodecimal(n,b1);
        // System.out.print(dn);
        int dn2=decimaltoanybase(dn,b2);
        System.out.print(dn2);
    }
    
    public static int anybasetodecimal(int n,int b){
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
    public static int decimaltoanybase(int n,int b){
        int dn=0;
        int tp=1;
        while(n>0){
            int r=n%b;
            n=n/b;
            
            dn=dn+r*tp;
            tp=tp*10;
        }
        return dn;
    }
}