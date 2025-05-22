package codeup.UP1400.p1417;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[10];

        for (int i = 0; i < 10; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        System.out.println(ns[7]);
    }
}