// 10.11 복습
package Ch1;

import java.util.Scanner;

public class Remove_Duplicate_Word_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if(i==str.indexOf(str.charAt(i))) {
                ans+=str.charAt(i);
            }

        }

        System.out.println(ans);
    }
}
