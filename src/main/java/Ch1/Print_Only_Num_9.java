package Ch1;

import java.util.Scanner;
public class Print_Only_Num_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for(int i = 0; i<str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) continue;
            else ans += str.charAt(i);
        }
        System.out.println(Integer.parseInt(ans));
    }
}
