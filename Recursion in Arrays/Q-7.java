 // Get Maze Paths

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int rows=scn.nextInt();
        int cols=scn.nextInt();
        ArrayList<String> paths=getMazePaths(1,1,rows,cols);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc , int dr , int dc){
        if(sr>dr || sc>dc){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        else if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> myPaths=new ArrayList<>();
        ArrayList<String> myHPaths=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> myVPaths=getMazePaths(sr+1,sc,dr,dc);
        for(String myhpath:myHPaths){ 
            myPaths.add("H"+myhpath);
        }
        for(String myvpath:myVPaths){
            myPaths.add("V"+myvpath);
        }
        return myPaths;
    }
}