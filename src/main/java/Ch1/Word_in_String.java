package Ch1;

import java.util.Scanner;

public class Word_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int max = 0;
        String ans = "";

        for (String x : s) {
            if (x.length() > max) {
                max = x.length();
                ans = x;
            }
        }
        System.out.println(ans);

    }
}