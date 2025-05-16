package codeup.UP1200.p1295;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();

        char[] chars = answer.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isUpperCase(ch)) {
                chars[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                chars[i] = Character.toUpperCase(ch);
            }
        }

        System.out.println(new String(chars));
    }
}