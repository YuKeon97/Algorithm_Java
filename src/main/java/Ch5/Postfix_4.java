package Ch5;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        String str = sc.next();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stk.push(x-48);
            } else {
                int n1 = stk.pop();
                int n2 = stk.pop();
                if(x=='+') stk.push(n2+n1);
                else if(x=='-') stk.push(n2-n1);
                else if(x=='*') stk.push(n2*n1);
                else stk.push(n2/n1);
            }
        }

        System.out.println(stk.get(0));
    }
}


