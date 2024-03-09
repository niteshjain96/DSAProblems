// Print All Primes till N

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int low=scn.nextInt();
		int high=scn.nextInt();
		for(int n=low;n<=high;n++){
		boolean flag=true;
		  int div=2;
		  while(div*div<=n){
		      int rem=n%div;
		      if(rem==0){
		          flag=false;
		          break;
		      }
		      div++;
		  }
		  if(flag){
		      System.out.println(n + " is Prime");
		  }
		}
	}
}
