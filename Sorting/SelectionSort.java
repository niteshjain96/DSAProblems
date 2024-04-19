import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        selectionsort(arr);
        print(arr);
    }

    public static void selectionsort(int[] arr){
        for(int itr=0;itr<=arr.length-2;itr++){
            int minidx=itr;
            for(int j=itr+1;j<=arr.length-1;j++){
                if(isSmaller(arr,j,minidx)==true){
                    minidx=j;
                }
            }
            swap(arr,itr,j);
        } 
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void swap(int[] arr , int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static boolean isSmaller(int [] arr , int i , int j){
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

}