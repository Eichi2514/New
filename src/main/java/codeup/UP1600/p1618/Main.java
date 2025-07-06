package codeup.UP1600.p1618;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ns = new int[3];
        for (int i = 0; i < 3; i++) {
            ns[i] = sc.nextInt();
        }

        Arrays.sort(ns);

        for (int i = 0; i < 3; i++) {
            System.out.print(ns[i] + " ");
        }
    }
}
