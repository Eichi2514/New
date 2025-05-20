package codeup.UP1400.p1413;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();

        for (int i = cs.length - 1; i >= 0; i--) {
            System.out.print(cs[i]);
        }
    }
}