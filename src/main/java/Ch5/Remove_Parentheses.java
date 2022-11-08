package Ch5;

import java.util.Scanner;
import java.util.Stack;

public class Remove_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stk = new Stack();
        String ans = "";

        for(char x : str.toCharArray()) {
            if(x!=')') stk.push(x);
            else {
                while(stk.pop()!='(');
            }
        }
        for(char x : stk) System.out.print(x);
    }
}

