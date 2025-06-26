package codeup.UP1500.p1551;

import java.util.Scanner;

public class Main {
    static int[] ns = new int[100010];

    private static int f(int a) {
        for (int i = 1; i <= ns.length - 1; i++) {
            if (ns[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            ns[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(f(k));
    }
}