package codeup.UP1600.p1615;

import java.util.Scanner;

public class Main {

    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean[] isSelfNumber = new boolean[b + 1];

        for (int i = 1; i <= b; i++) {
            int generator = d(i);
            if (generator <= b) {
                isSelfNumber[generator] = true;
            }
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (!isSelfNumber[i]) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}