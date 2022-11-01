package Ch3;

import java.util.Scanner;

public class Max_Length_Continuous_Subsequence_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        int cnt = 0, lt = 0;

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int rt = 0; rt<n; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            ans = Math.max(ans, rt-lt+1);
        }
        System.out.println(ans);

    }
}
