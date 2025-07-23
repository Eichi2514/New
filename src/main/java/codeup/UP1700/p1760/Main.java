package codeup.UP1700.p1760;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) + "", i);
        }

        String s2 = sc.nextLine();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != ' ') {
                System.out.print(map.get(s2.charAt(i) + ""));
            } else System.out.print(" ");
        }
    }
}