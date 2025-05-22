package codeup.UP1400.p1418;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 't') {
                System.out.print((i + 1) + " ");
            }
        }
    }
}