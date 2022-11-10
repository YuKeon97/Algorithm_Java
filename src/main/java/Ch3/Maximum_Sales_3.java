package Ch3;

import java.util.Scanner;

public class Maximum_Sales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        int lt = 0, rt = m, sum = 0;

        for(int i = 0; i<m; i++) sum += arr[i];
        int max = sum;

        while(rt<arr.length) {
            sum = sum + arr[rt++] - arr[lt++];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}


