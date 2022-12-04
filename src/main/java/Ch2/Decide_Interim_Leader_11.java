package Ch2;

import java.util.Scanner;

public class Decide_Interim_Leader_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, max = 0, ans = 0;
        int[][] arr = new int[n+1][6];
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i<=n; i++) {
            cnt = 0;
            for(int j = 1; j<=n; j++) {
                for(int k = 1; k<=5; k++) {
                    if(arr[i][k]==arr[j][k]) {
                        cnt++;
                        break; //cnt(같은 반이었던 횟수)가 아닌 학생(i)을 출력하는 것이기 때문에 break// 3번 4번 학생이 같은 반이었던 적이 있다가 중요하지 몇 번 같은 반이었던지를 출력하는 것이 아남
                    }
                }
                if(cnt>max) {
                    max = cnt;
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}

