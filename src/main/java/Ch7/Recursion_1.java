package Ch7;

import java.util.Scanner;

public class Recursion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }

    private static void recursion(int n) {
        if (n == 0) return;
        else {
            recursion(n - 1);
            System.out.print(n+" ");
        }
    }
}

