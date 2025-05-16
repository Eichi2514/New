package codeup.UP1200.p1297;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0, l = 0;

        for (int i = n / 2; i > 0; i--) {
            if (i * (n - 2 * i) > l) {
                l = i * (n - 2 * i);
                m = i;
            } else if (i * (n - 2 * i) == l && i < m) {
                m = i;
            }
        }

        System.out.println(m);
    }
}