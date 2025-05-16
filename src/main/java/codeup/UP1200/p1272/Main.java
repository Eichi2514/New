package codeup.UP1200.p1272;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long tmp = 0;
        for (int j = 0; j < 2; j++) {
            long a = 1;
            long b = 10;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    tmp = a;
                    a++;
                }
                if (i % 2 == 0) {
                    tmp = b;
                    b += 10;
                }
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
}