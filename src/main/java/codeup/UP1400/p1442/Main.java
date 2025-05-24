package codeup.UP1400.p1442;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10002];
        int n, temp, min;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            min = i;
            for (int j = i + 1; j <= n; j++) {
                if (a[min] > a[j]) min = j;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int i = 1; i <= n; i++) System.out.println(a[i]);
    }
}