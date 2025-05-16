package codeup.UP1200.p1289;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            max = max < x * y ? x * y : max;
        }

        System.out.println(max);
    }
}