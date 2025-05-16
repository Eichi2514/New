package codeup.UP1200.p1280;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                System.out.print("+" + i);
                sum += i;
            } else {
                System.out.print("-" + i);
                sum -= i;
            }
        }
        System.out.println("=" + sum);
    }
}