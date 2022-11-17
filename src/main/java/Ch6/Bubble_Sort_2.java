package Ch6;

import java.util.Scanner;

public class Bubble_Sort_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                while (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}


