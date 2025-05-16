package codeup.UP1200.p1283;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        double c = a;

        for (int i = 0; i < b; i++) {
            int change;
            change = sc.nextInt();
            c *= (1 + change / 100.0);
        }

        double tmp = Math.round(c - a);

        System.out.println((int) tmp);

        if (tmp > 0.5) {
            System.out.println("good");
        } else if (tmp < -0.5) {
            System.out.println("bad");
        } else {
            System.out.println("same");
        }
    }
}