package Ch6;

import java.util.Scanner;

public class Selection_Sort_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();


        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min]>arr[j]) min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

        for (int i : arr) System.out.print(i+" ");

    }
}

