// 10.11 복습(다시 풀어보기)
package Ch1;

import java.util.Scanner;

public class Reverse_Certain_Word_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();

        int ri = str.length - 1;
        int li = 0;
        char tmp;

        while (li < ri) {
            if (!Character.isAlphabetic(str[li])) li++;
            else if (!Character.isAlphabetic(str[ri])) ri--;
            else {
                tmp = str[li];
                str[li] = str[ri];
                str[ri] = tmp;
                li++;
                ri--;
            }
        }

        for (char c : str) {
            System.out.print(c);
        }
    }
}

