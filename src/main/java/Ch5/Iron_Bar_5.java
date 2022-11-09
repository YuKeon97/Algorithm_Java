package Ch5;

import java.util.Scanner;
import java.util.Stack;

public class Iron_Bar_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();
        String str = sc.next();
        int ans = 0;

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                stk.push('(');
            } else {
                stk.pop();
                if(str.charAt(i-1)=='(') ans += stk.size();
                else ans++;
            }
        }

        System.out.println(ans);
    }
}
