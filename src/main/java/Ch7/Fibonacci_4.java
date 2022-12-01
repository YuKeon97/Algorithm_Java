package Ch7;

import java.util.Scanner;

public class Fibonacci_4 {
    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        fib(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }

    private static int fib(int n) {
        if (fibo[n]>0) return fibo[n];
        if (n == 1 || n == 2) return fibo[n]=1;
        else return fibo[n] = fib(n - 1) + fib(n - 2);
    }
}
