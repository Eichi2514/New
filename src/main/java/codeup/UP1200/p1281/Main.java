package codeup.UP1200.p1281;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int num = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print("-" + i);
                num -= i;
            } else {
                if (i != a) System.out.print("+");
                System.out.print(i);
                num += i;
            }
        }

        System.out.print("=" + num);
    }
}