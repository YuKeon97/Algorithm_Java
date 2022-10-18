// 10.11 복습(5)
package Ch1;

import java.util.Scanner;

public class Word_in_String_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tmp = str.split(" ");
        int max = 0;
        String ans = "";

        for (String s : tmp) {
            if (max < s.length()) {
                max = s.length();
                ans = s;
            }
        }
        System.out.println(ans);
    }
}

