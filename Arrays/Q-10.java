// Subsets of Array

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=scn.nextInt();
		}
		int lim= (1 << n);  // Always use brackets for this
		
		for(int i=0;i<lim;i++){
		    int dec=i;
		    
		    // binary of the decimal and if remainder is zero dont print else print StackTraceElement
		    String str="";
		    for(int j=0;j<arr.length;j++){
		        int rem=dec%2;
		        dec=dec/2;
		        if(rem==0){
		          str="-\t"+str;
		        }
		        else{
		           str=arr[arr.length-1-j]+"\t"+str;
		        }
		    }
		    System.out.println(str);
		}
	}
}
