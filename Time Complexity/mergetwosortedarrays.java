import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int m=scn.nextInt();
        int [] b= new int[m];
        for(int i=0;i<b.length;i++){
            b[i]=scn.nextInt();
        }
        int [] mergedArray= mergeSortedArray(a,b);
        print(mergedArray);
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static int[] mergeSortedArray(int []a,int []b){
        int [] mergedArray= new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                mergedArray[k]=a[i];
                i++;
               
            }
            else{
                mergedArray[k]=b[j];
                j++;
                
            }
            k++;
        }
        while(i<a.length){
            mergedArray[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            mergedArray[k]=b[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}