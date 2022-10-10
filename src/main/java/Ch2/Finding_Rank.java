package Ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Finding_Rank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] ans = new int[n];
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num[i] < num[j]) {
                    cnt++;
                }
            }
            ans[i] = cnt;
            cnt = 1;
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}

