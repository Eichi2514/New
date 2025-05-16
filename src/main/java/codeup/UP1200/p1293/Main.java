package codeup.UP1200.p1293;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0, min = 100;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println(max + " " + min);
    }
}