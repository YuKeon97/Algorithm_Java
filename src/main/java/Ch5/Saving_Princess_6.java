package Ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Saving_Princess_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        for(int i = 1; i<=n; i++) q.offer(i);
        while(!q.isEmpty()) {
            for(int i = 1; i<k; i++) q.offer(q.poll());
            q.poll();
            if(q.size()==1) ans = q.poll();
        }
        System.out.println(ans);
    }
}
