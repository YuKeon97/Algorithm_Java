package Ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class Combining_Two_Arrays_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int p1 = 0, p2 = 0;
        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] < arr2[p2]) ans.add(arr1[p1++]);
            else ans.add(arr2[p2++]);
        }
        while (p1 < n1) {
            ans.add(arr1[p1++]);
        }

        while (p2 < n2) {
            ans.add(arr2[p2++]);
        }

        for (Integer an : ans) {
            System.out.print(an+" ");
        }
    }
}

/**
 * 단순한 풀이
 */
//package Ch3;
//
//        import java.util.ArrayList;
//        import java.util.Collection;
//        import java.util.Collections;
//        import java.util.Scanner;
//
//public class Combining_Two_Arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n1 = sc.nextInt();
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        for (int i = 0; i < n1; i++) {
//            arr1.add(sc.nextInt());
//        }
//
//        int n2 = sc.nextInt();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        for (int i = 0; i < n2; i++) {
//            arr2.add(sc.nextInt());
//        }
//
//        arr1.addAll(arr2);
//        Collections.sort(arr1);
//        for (Integer integer : arr1) {
//            System.out.print(integer);
//        }
//    }
//}