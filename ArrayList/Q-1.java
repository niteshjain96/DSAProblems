// Remove Primes
import java.util.*;

public class Main{
    public static void main(String[] str){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

    public static boolean isPrime(int num){
        boolean isPrime=true;

        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void solution(ArrayList<Integer> al){
        // Code
        for(int i=0;i<al.size();i++){
            int val=al.get(i);
            boolean isThisValPrime=isPrime(val);
            if(isThisValPrime==true){
                al.remove(i);
                i--;    
            }
            
        }
    }
}