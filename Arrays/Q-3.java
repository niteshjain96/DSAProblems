// BarChart of Array Element

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		int n=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=scn.nextInt();
		}
		int maxht=arr[0];
		for(int i=1;i<arr.length;i++){
		    if(arr[i]>maxht){
		        maxht=arr[i];
		    }
		}
		for(int ht=maxht;ht>=1;ht--){
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>=ht){
		            System.out.print("*"+"\t");
		        }
		        else
		        {
		            System.out.print("\t");
		        }
		    }
		    System.out.println();
		}
	}
}
