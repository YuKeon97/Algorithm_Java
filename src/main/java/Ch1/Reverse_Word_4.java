// 10.11 복습(1)
package Ch1;

import java.util.Scanner;

public class Reverse_Word_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            String str = new StringBuilder(sc.next()).reverse().toString();
            System.out.println(str);
        }
    }
}

