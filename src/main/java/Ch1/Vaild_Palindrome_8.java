package Ch1;

import java.util.Scanner;

public class Vaild_Palindrome_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

