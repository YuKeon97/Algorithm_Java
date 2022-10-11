// 10.11 복습(다시 풀어보기)
package Ch1;

import java.util.Scanner;

public class Reverse_Certain_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ans = sc.next().toCharArray();
        int ri;
        int li;
        li = 0;
        ri = ans.length - 1;

        while (ri > li) {
            if (!Character.isAlphabetic(ans[ri])) ri--;
            else if (!Character.isAlphabetic(ans[li])) li++;
            else {
                char tmp = ans[ri];
                ans[ri] = ans[li];
                ans[li] = tmp;
                ri--;
                li++;
            }
        }
        for(char x : ans) {
            System.out.print(x);
        }
    }
}
