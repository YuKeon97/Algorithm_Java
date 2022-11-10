package Ch3;

import java.util.Scanner;

public class Max_Length_Continuous_Subsequence_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int lp = 0, cnt = 0, ans = 0;

        for(int i = 0; i<n; i++) {arr[i] = sc.nextInt();}

        for(int rp = 0; rp<n; rp++) {
            if(arr[rp]==0) cnt++;
            while(cnt>m) {
                if(arr[lp]==0) cnt--;
                lp++;
            }
            ans = Math.max(ans, rp-lp+1);
        }
        System.out.println(ans);
    }
}


