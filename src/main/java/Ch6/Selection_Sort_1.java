package Ch6;

import java.util.Scanner;

public class Selection_Sort_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();


        for(int i = 0; i<n-1; i++) {
            int idx = i;
            for(int j = i+1; j<n; j++) {
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        for(int x : arr) System.out.print(x+" ");

    }
}

