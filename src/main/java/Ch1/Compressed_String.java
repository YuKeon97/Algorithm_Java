package Ch1;

import java.util.Scanner;

public class Compressed_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next()+" ";
        int cnt = 1;
        String ans = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                ans += str.charAt(i);
                if (cnt > 1) {
                    ans += String.valueOf(cnt);
                }
                cnt=1;
            }
        }
        System.out.println(ans);
    }
}
// 2번 풀이
//    Scanner sc = new Scanner(System.in);
//    String str = sc.next();
//    int cnt = 1;
//    String ans = "";
//
//        for (int i = 0; i < str.length(); i++) {
//        if(i==str.length()-1){
//        ans+=str.charAt(i)+ Integer.toString(cnt);
//        break;
//        }
//        if (str.charAt(i) == str.charAt(i + 1)) {
//        cnt++;
//        } else {
//        if(cnt==1) {
//        ans+=str.charAt(i);
//        continue;
//        }
//        ans+=str.charAt(i)+ Integer.toString(cnt);
//        cnt = 1;
//        }
//        }
//        System.out.println(ans);