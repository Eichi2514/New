package codeup.UP1200.p1286;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min;
        max = sc.nextInt();
        min = max;

        for (int i = 0; i < 4; i++) {
            int tmp = sc.nextInt();
            if (tmp < min) {
                min = tmp;
            }
            if (tmp > max) {
                max = tmp;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}