package Ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum_Design_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> q = new LinkedList<>();
        String str = sc.next();
        String k = sc.next();
        for(char x : str.toCharArray()) q.offer(x);

        for(char x : k.toCharArray()) {
            if(q.contains(x)) {
                if(x!=q.poll()) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        if(!q.isEmpty()) System.out.println("NO");
        else System.out.println("YES");

    }
}

