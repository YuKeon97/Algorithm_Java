package Ch2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Prime_Number_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ans = new ArrayList();

        for(int i = 0; i<n; i++) {
            String tmp = new StringBuilder(sc.next()).reverse().toString();
            arr[i] = Integer.parseInt(tmp);
        }

        for(int i = 0; i<n; i++) {
            boolean flag = true;
            if(arr[i]==1) continue;
            for(int j = 2; j<arr[i]; j++) {
                if(arr[i]%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans.add(arr[i]);
        }
        for(int i :ans) System.out.print(i+" ");
    }
}






//package Ch2;
//
//        import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class Reverse_Prime_Number {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] num = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//        }
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int tmp = num[i];
//            int res = 0;
//            while (tmp > 0) {
//                int t = tmp % 10;
//                res = res * 10 + t;
//                tmp = tmp / 10;
//            }
//            num[i] = res;
//        }
//
//        boolean flag = false;
//
//        for (int i = 0; i < num.length; i++) {
//
//            if (num[i] == 2) { // 2는 소수
//                ans.add(num[i]);
//                continue;
//            }
//
//            if (num[i] == 1) { // 1은 소수가 아님
//                continue;
//            }
//
//            for (int j = 2; j < num[i]; j++) {
//                if (num[i] % j == 0) {
//                    flag = false; // 소수가 아닌 경우 flag를 false로 변환
//                    break;
//                }
//                flag = true;
//            }
//            if (flag) { // flag가 true인 경우 동작
//                ans.add(num[i]);
//            }
//        }
//        for (int i : ans) {
//            System.out.print(i + " ");
//        }
//    }
//}
//

