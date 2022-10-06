package Ch2;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Bigger_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        ans.add(num[0]);

        for (int i = 1; i < n; i++) {

            if (num[i - 1] < num[i]) {
                ans.add(num[i]);
            }
        }
        for (Integer x : ans) {
            System.out.print(x+" ");
        }

    }
}

//2번 풀이
// import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] num = new int[n];
//
//
//        for (int i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//        }
//
//        System.out.print(num[0]);
//
//        for (int i = 0; i < n-1; i++) {
//            if (num[i+1] > num[i]) {
//                System.out.print(" " + num[i+1]);
//            }
//        }
//
//    }
//}

