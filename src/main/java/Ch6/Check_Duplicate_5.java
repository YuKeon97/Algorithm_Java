package Ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Duplicate_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("D");
                System.exit(0);
            }
        }
        System.out.println("U");
    }
}


//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//
//        for (int i = 0; i < n - 1; i++) {
//        for (int j = i + 1; j < n; j++) {
//        if (arr[i] == arr[j]) {
//        System.out.println("D");
//        System.exit(0);
//        }
//        }
//        }
//        System.out.println("U");