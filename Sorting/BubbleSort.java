import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }

    public static void bubbleSort(int [] arr){
        for(int itr=1;itr<=arr.length-1;itr++){
            for(int j=0;j<=arr.length-1-itr;j++){
                if(isSmaller(arr,j+1,j)==true){
                    swap(arr,j+1,j);
                }
            }
        }
        
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static boolean isSmaller(int[] arr,int i , int j){
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }
    public static void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}