// Fibonacci

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        Fibonacci(n);
    }

    public static void Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=Fibonacci(n-1);
        int fibnm2=Fibonacci(n-2);
        int fibn=fibnm1+fibnm2;
        System.out.print(fibn);
    }
}