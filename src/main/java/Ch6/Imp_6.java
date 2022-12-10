package Ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Imp_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) System.out.print(i+1+" ");
        }
    }
}
