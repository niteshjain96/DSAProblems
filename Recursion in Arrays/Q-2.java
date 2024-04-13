// Display Array Reverse

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        displayArrReverse(arr,arr.length-1);
    }

    public static void displayArrReverse(int [] arr , index){
        if(index<0){
            return;
        }
        System.out.print(arr[index]+"\t");
        displayArrReverse(arr,index-1);
    }
}