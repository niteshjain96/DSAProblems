// Print Decreasing Increasing by Recursion

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        DecreasingIncreasing(n);
    }

    public static void DecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        DecreasingIncreasing(n-1);
        System.out.println(n);
    
        
    }
}  