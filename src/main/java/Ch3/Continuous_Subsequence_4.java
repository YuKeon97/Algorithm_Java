package Ch3;

import java.util.Scanner;

public class Continuous_Subsequence_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
        int lt = 0, rt = 0, cnt = 0, sum = 0;

        while(rt<arr.length) {
            sum+=arr[rt++];
            if(sum==m) cnt++;
            while(sum>m) {
                sum-=arr[lt++];
                if(sum==m) cnt++;
            }
        }
        System.out.println(cnt);
    }
}

