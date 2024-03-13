// Pattern 11
//  1
//  2   3
//  4   5   6
//  7   8   9   10
//  11  12  13  14  15
// 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nst=1;
        int count=1;
        for(int r=1;r<=n;r++){
            for(int i=1;i<=nst;i++){
                System.out.print(count+"\t");
                count++;
            }
            nst++;
            System.out.println();
        }
    }
}