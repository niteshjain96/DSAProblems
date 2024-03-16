// Find Element in Arrays

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int d=scn.nextInt();
        int foundAt=-1;
        int [] arr= new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                foundAt=i;
                break;
            }
        }
        System.out.println(foundAt+ " index ");
        
        
    }
}