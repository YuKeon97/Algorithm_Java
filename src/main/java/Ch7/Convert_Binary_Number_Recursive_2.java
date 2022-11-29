package Ch7;

import java.util.Scanner;

public class Convert_Binary_Number_Recursive_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }

    static void recursion(int n) {
        if(n==0) return;
        else{
            recursion(n/2);
            System.out.print(n%2);
        }
    }
}
