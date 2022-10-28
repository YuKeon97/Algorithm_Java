package Ch3;

import java.util.Scanner;

public class Sum_Of_Consecutive_Numbers_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2 + 1;
        int[] arr = new int[m];
        int sum = 0;
        int lt = 0, rt = 0;
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            sum += arr[rt++];
            if (sum == n) cnt++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    cnt++;
                }

            }
        }
        System.out.println(cnt);

    }
}
