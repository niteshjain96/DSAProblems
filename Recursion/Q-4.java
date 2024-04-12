// Factorial

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int ans=Factorial(n);
        System.out.println(ans);
    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int ans=n*Factorial(n-1);
        return ans;
    }
}