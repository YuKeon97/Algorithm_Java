package Ch1;

import java.util.Scanner;

public class Palindrome_String_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
