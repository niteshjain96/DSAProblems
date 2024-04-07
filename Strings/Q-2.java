// String Compression
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(Compression1(str));
        System.out.println(Compression2(str));
    }

    public static String Compression1(String str) {
        String ans = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                ans += str.charAt(i);
            }
        }
        ans += str.charAt(str.length() - 1);
        return ans;
    }

    public static String Compression2(String str) {
        String ans = "";
        int c = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                c++;
            } else {
                ans += str.charAt(i);
                if (c > 1) {
                    ans += c;
                    c = 1;
                }
            }
        }
        ans += str.charAt(str.length() - 1);
        if (c > 1) {
            ans += c;
        }
        return ans;
    }
}
