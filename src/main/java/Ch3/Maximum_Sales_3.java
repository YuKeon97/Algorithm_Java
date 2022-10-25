package Ch3;

import java.util.Scanner;

public class Maximum_Sales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[day];

        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        max = sum;


        for (int i = n; i < day; i++) {
            sum = sum + arr[i] - arr[i - n];
            max = Math.max(max, sum);
        }
        System.out.println(sum);
    }
}
