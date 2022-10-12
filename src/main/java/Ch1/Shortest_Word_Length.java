package Ch1;

import java.util.Scanner;

public class Shortest_Word_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr = sc.next().charAt(0);
        int[] ans = new int[str.length()];
        int cnt = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                cnt = 0;
            } else {
                cnt++;
            }
            ans[i] = cnt;
        }

        cnt = 1000;

        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == chr) {
                cnt = 0;
            } else {
                cnt++;
            }
            ans[i] = Math.min(ans[i], cnt);
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}




