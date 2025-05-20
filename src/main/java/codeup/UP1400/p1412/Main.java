package codeup.UP1400.p1412;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();

        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i, 0);
        }

        String s = sc.nextLine().replaceAll("[^a-z]", "");
        char[] cs = s.toCharArray();

        for (char c : cs) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            System.out.println(c + ":" + map.get(c));
        }
    }
}