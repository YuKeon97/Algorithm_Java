package Ch1;

import java.util.Scanner;

public class Shortest_Word_Length_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr = sc.next().charAt(0);
        int cnt = 1000;
        int[] ans = new int[str.length()];
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)!=chr) {
                cnt++;
                ans[i] = cnt;
            } else {
                cnt = 0;
            }
        }
        cnt = 1000;
        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)!=chr) {
                cnt++;
                if(cnt < ans[i]) { //Math.min으로도 가능
                    ans[i] = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        for(int i : ans) {
            System.out.print(i+" ");
        }
    }
}









