package Ch2;

import java.util.Scanner;

public class Calculate_Score_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                ans += cnt;
            } else {
                cnt=0;
            }
        }
        System.out.println(ans);
    }
}


//package Ch2;
//
//        import java.util.Scanner;
//
//public class Calculate_Score_7 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] num = new int[n];
//        int ans = 0;
//        int cnt = 0;
//
//        for (int i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (num[i] == 0) {
//                cnt = 0;
//            } else {
//                cnt++;
//                ans += cnt;
//            }
//        }
//        System.out.println(ans);
//    }
//}

