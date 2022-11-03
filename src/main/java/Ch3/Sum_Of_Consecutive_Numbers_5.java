package Ch3;

import java.util.Scanner;

public class Sum_Of_Consecutive_Numbers_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n/2+1];
        int lp = 0, rp = 0;
        int sum = 0, cnt = 0;

        for(int i = 0; i<arr.length; i++) arr[i] = i+1;

        for(int i = 0; i<n/2+1; i++) {
            sum+=arr[rp++];
            if(sum==n) cnt++;
            while(sum>=n) {
                sum-=arr[lp++];
                if(sum==n)cnt++;
            }
        }

        System.out.println(cnt);

    }
}

