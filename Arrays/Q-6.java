// Reverse an Array

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        reverse(a);
        display(a);
    }

    public static void reverse(int []a){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public static void display(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
