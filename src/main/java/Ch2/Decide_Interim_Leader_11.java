package Ch2;

import java.util.Scanner;

public class Decide_Interim_Leader_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        int cnt;
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 1; i <= n; i++) { // i : 행(학생) j : 열(학년)
            for (int j = 1; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) { // i : 행(학생) j : 열(학년)
            cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}


