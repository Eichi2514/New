package codeup.UP1500.p1509;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] n2s = new int[11][10];

        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 10; y++) {
                n2s[x][y] = sc.nextInt();
            }
        }

        for (int y = 0; y < 10; y++) {
            String s = "safe";
            for (int x = 9; x >= 0; x--) {
                if (n2s[x][y] > 0) {
                    s = "crash";
                    break;
                } else if (n2s[x][y] < 0) {
                    s = "fall";
                    break;
                }
            }
            if (n2s[10][y] == 1) System.out.println((y + 1) + " " + s);
        }
    }
}