package Ch2;

import java.util.Scanner;

public class Prime_Number_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 2; i < n; i++) {

        }
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(cnt);
    }
}


//package Ch2;
//
//        import java.util.Scanner;
//
//public class Prime_Number_5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] num = new int[n+1];
//        int cnt = 0;
//
//        for (int i = 2; i <= n; i++) {
//            if (num[i] == 0) {
//                cnt++;
//                for (int j = i; j <= n; j = j+i) {
//                    num[j] = 1;
//                }
//            }
//        }
//
//        System.out.println(cnt);
//    }
//}
