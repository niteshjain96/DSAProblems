// Max of an Array

// Max of an Array

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        int result=maximum(arr,0);
        System.out.println(result);
    }

    public static int maximum(int [] arr ,int index){
        if(index==arr.length-1){
            return arr[idx];
        }
        int max=maximum(arr,index+1);
        if(arr[index]>max){
            return arr[index];
        }
        else{
            return max;
        }
    }
}