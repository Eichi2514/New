package codeup.UP1500.p1536;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] d = new int[110];

    private static int f() {
        int min = d[1];
        for (int i = 1; i <= n; i++) {
            if (d[i] <= min) {
                min = d[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if (d[i] == min) {
                return d[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
        }

        System.out.println(f());
    }
}
