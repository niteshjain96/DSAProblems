// Pattern 12
//  0
//  1   1
//  2   3   5
//  8   13   21   34
// 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        int nst=1;
        for(int r=1;r<=n;r++){
            for(int i=1;i<=nst;i++){
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c;
            }
            nst++;
            System.out.println();
        }
    }
}