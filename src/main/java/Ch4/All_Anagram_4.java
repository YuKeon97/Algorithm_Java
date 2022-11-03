package Ch4;

import java.util.HashMap;
import java.util.Scanner;

public class All_Anagram_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        int ans = 0;

        for(char x : t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0)+1);
        int l = t.length()-1;
        for(int i = 0; i<l; i++) sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0)+1);

        int lt = 0;
        for(int rt = l; rt<s.length(); rt++) {
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0)+1);
            if(sm.equals(tm)) ans++;
            sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
            if(sm.get(s.charAt(lt))==0) sm.remove(s.charAt(lt));
            lt++;
        }
        System.out.println(ans);
    }
}
