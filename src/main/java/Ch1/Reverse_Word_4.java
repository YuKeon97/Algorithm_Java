// 10.11 복습(1)

package Ch1;

import java.util.Scanner;

public class Reverse_Word_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder ans = new StringBuilder(str[i]);
            System.out.println(ans.reverse());
        }
    }
}
