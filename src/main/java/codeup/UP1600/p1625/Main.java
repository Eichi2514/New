package codeup.UP1600.p1625;

import java.util.Scanner;

public class Main {

    public static int S(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum < 10) {
            return sum;
        } else {
            return S(sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int sum = S(m);

            System.out.println(sum);
        }
    }
}