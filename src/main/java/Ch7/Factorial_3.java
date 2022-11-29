package Ch7;

import java.util.Scanner;

public class Factorial_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }
    public static int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
}
