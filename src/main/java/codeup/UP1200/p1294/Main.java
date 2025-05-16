package codeup.UP1200.p1294;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        char[] chars = answer.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) ((ch - 'a' + 3) % 26 + 'a');
            }
        }

        System.out.println(new String(chars));
    }
}