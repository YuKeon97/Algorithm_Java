package Ch5;

import java.util.Scanner;
import java.util.Stack;

public class Correct_Parentheses_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)=='(') st.add(str.charAt(i));
            else {
                if(st.empty()) {
                    System.out.println("NO");
                    System.exit(0);
                }
                st.pop();
            }
        }
        if(st.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}


