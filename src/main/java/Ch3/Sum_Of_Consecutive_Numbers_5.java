package Ch3;

import java.util.Scanner;

public class Sum_Of_Consecutive_Numbers_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i = 0; i<m; i++) arr[i] = i+1;
        int sum = 0, lt = 0, rt = 0, cnt = 0;

        while(rt<m) {
            sum += arr[rt++];
            if(n==sum) cnt++;
            while(sum>n) {
                sum-=arr[lt++];
                if(n==sum) cnt++;
            }
        }
        System.out.println(cnt);

    }
}

