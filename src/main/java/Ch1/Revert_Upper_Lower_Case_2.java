package Ch1;

import java.util.Scanner;

public class Revert_Upper_Lower_Case_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans += Character.toLowerCase(str.charAt(i));
            } else {
                ans += Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}

//package Ch1;
//
//        import java.util.Scanner;
//
//public class Revert_Upper_Lower_Case_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String ans = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                ans += Character.toLowerCase(str.charAt(i));
//            } else {
//                ans += Character.toUpperCase(str.charAt(i));
//            }
//        }
//        System.out.println(ans);
//    }
//}
