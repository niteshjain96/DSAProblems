
// Print 1 to 5 or 1 to n;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		while(n>=i){
		    System.out.print(i+ "  ");
		    i++;
		}
	}
}
