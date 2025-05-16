package codeup.UP1100.p1124;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        ch = ch.replace("C", "12 ");
        ch = ch.replace("H", " ");
        String[] tmps = ch.split(" ");
        int[] chs = new int[tmps.length];
        for (int i = 0; i < tmps.length; i++) {
            chs[i] = Integer.parseInt(tmps[i]);
        }
        System.out.println(chs[0] * chs[1] + chs[2]);
    }
}