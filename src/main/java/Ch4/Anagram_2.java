package Ch4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str1.toCharArray()) map.put(x, map.getOrDefault(x, 0)+1);

        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x)==0) {
                System.out.println("NO");
                System.exit(0);
            }
            map.put(x, map.getOrDefault(x, 0)-1);
        }
        System.out.println("YES");
    }
}


/**HashMap 두 개*/
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        String str1 = sc.next();
//        String str2 = sc.next();
//
//        for(int i = 0; i<str1.length(); i++) {
//            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
//        }
//
//        for(int i = 0; i<str2.length(); i++) {
//            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
//        }
//
//        boolean flag = true;
//
//        for(char key : map1.keySet()) {
//            if(!map2.containsKey(key)) flag = false;
//            if(!map2.containsValue(map1.get(key))) flag = false;
//        }
//        if(flag) System.out.println("YES");
//        else System.out.println("NO");
//    }