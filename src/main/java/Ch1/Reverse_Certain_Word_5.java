// 10.11 복습(다시 풀어보기)
package Ch1;

import java.util.Scanner;

public class Reverse_Certain_Word_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int lc = 0, rc = str.length-1;

        while(lc<rc) {
            if(Character.isAlphabetic(str[lc])) {
                if(Character.isAlphabetic(str[rc])) {
                    char tmp = str[lc];
                    str[lc] = str[rc];
                    str[rc] = tmp;
                    lc++;
                    rc--;
                } else rc--;
            } else lc++;
        }
        for(char x : str) {
            System.out.print(x);
        }

    }
}

