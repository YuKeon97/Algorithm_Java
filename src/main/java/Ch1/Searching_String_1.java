package Ch1;

import java.util.Scanner;

public class Searching_String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        char chr = sc.nextLine().toLowerCase().charAt(0);
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if (chr == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
