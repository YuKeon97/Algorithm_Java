package Ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(Arrays.asList(arr).indexOf(m));
    }
}
