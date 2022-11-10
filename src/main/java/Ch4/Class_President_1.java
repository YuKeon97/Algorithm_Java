package Ch4;
import java.util.HashMap;
import java.util.Scanner;

public class Class_President_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int max = 0;
        char ans = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()) map.put(x, map.getOrDefault(x, 0)+1);

        for(char key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans);
    }
}



//import java.util.Scanner;
//
//public class Class_President_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String str = sc.next();
//        int[] arr = new int[26];
//        int max = 0;
//        int ans = 0;
//        for(int i = 0; i<str.length(); i++) {
//            int tmp = str.charAt(i)-65;
//            arr[tmp]++;
//        }
//        for(int i = 0; i<arr.length; i++) {
//            if(max<arr[i]) {
//                max = arr[i];
//                ans = i;
//            }
//        }
//        System.out.println((char) (65+ans));
//    }
//}

