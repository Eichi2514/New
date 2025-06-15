package codeup.UP1500.p1521;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                int a = sc.nextInt();
                if (a >= 0 && a + N < 6) count++;
            }
        }

        System.out.print(count);
    }
}