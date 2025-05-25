package codeup.UP1400.p1443;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10002];
        int n, j, temp, key;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            key = i;
            key = a[i];
            for (j = i - 1; j >= 1 && a[j] > key; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = key;
        }

        for (int i = 1; i <= n; i++) System.out.println(a[i]);
    }
}