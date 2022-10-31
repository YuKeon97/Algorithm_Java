package Ch2;

import java.util.Scanner;

public class Grid_Maximum_Sum_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int max = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        sum1 = sum2 = 0;

        for(int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        System.out.println(max);
    }
}




//package Ch2;
//
//        import java.util.Scanner;
//
//public class Grid_Maximum_Sum_9 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i = 0; i<n; i++) {
//            for(int j = 0; j<n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int sum1, sum2;
//        int ans = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum1 = sum2 = 0;
//            for (int j = 0; j < n; j++) {
//                sum1 += arr[i][j];
//                sum2 += arr[j][i];
//            }
//            ans = Math.max(ans, sum1);
//            ans = Math.max(ans, sum2);
//        }
//        sum1 = sum2 = 0;
//        for (int i = 0; i < n; i++) {
//            sum1 += arr[i][i];
//            sum2 += arr[i][n - i - 1];
//        }
//        ans = Math.max(ans, sum1);
//        ans = Math.max(ans, sum2);
//        System.out.println(ans);
//    }
//}
