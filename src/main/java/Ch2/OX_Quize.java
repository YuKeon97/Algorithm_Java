package Ch2;

import java.util.Scanner;

public class OX_Quize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (num[i] == 0) {
                cnt = 0;
            } else {
                cnt++;
                ans += cnt;
            }
        }
        System.out.println(ans);
    }
}
