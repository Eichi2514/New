package codeup.UP1400.p1419;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String target = "love";

        for (int i = 0; i <= s.length() - target.length(); i++) {
            String sub = s.substring(i, i + target.length());
            if (sub.equals(target)) {
                count++;
            }
        }

        System.out.println(count);
    }
}