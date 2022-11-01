package Ch3;

import java.util.Scanner;

public class Continuous_Subsequence_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        int p1 = 0, p2 = 0;
        while(p2<n) {
            sum += arr[p2++];
            if (sum==k) cnt++;
            while(sum>=k) {
                sum -= arr[p1++];
                if(sum==k) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
