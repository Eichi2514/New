package codeup.UP1400.p1492;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            tmp += sc.nextInt();
            System.out.print(tmp + " ");
        }

    }
}