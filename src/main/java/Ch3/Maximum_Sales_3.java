package Ch3;

import java.util.Scanner;

public class Maximum_Sales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        for(int i = 0; i<k; i++) sum += arr[i];

        max = sum;

        for(int i = k; i<n; i++) {
            sum = sum + arr[i] - arr[i-k];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

