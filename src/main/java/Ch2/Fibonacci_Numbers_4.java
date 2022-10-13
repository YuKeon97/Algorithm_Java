package Ch2;

import java.util.Scanner;

public class Fibonacci_Numbers_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

//package Ch2;
//
//        import java.util.Scanner;
//
//public class Fibonacci_Numbers_4 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        int[] ans = new int[num];
//
//        ans[0] = 1;
//        ans[1] = 1;
//
//        for (int i = 2; i < num; i++) {
//            ans[i] = ans[i - 2] + ans[i - 1];
//        }
//
//        for (int i = 0; i < num; i++) {
//            System.out.print(ans[i]+" ");
//        }
//    }
//}
