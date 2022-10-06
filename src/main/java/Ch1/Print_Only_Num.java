package Ch1;

import java.util.Scanner;
public class Print_Only_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                continue;
            } else {
                ans += str.charAt(i);
            }
        }
        int answ = Integer.parseInt(ans);
        System.out.println(answ);
    }
}