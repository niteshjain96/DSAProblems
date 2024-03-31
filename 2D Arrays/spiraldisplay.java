import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int [][]arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr.length-1;
        int total=n*m;
        int count=1;
        while(count<=total){
            // left wall, downwards (column same row vary)
            for(int i=minr;i<=maxr && count<=total;i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            // bottom wall upwards
            for(int j=minc;j<=maxc && count<=total;j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            // RIGHT wall upwards
            for(int i=maxr;i>=minr && count<=total;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            // top wall leftwards
            for(int j=maxc;j>=minc && count<=total;j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
            
        }
    }
}