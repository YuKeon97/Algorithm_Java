package Ch3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find_Same_Elements_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i<n1; i++) arr1[i] = sc.nextInt();
        Arrays.sort(arr1);

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i<n2; i++) arr2[i] = sc.nextInt();
        Arrays.sort(arr2);

        ArrayList<Integer> ans = new ArrayList();

        int p1 = 0, p2 = 0;

        while(p1<n1 && p2<n2) {
            if(arr1[p1]==arr2[p2]) ans.add(arr1[p1++]);
            else if(arr1[p1] > arr2[p2]) p2++;
            else p1++;
        }
        for(int i : ans) System.out.print(i+" ");
    }
}

