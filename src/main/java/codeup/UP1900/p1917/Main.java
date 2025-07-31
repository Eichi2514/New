package codeup.UP1900.p1917;

import java.util.Scanner;

public class Main {

    public static long f(int n, int k) {
        if (k == 0) return 1L;
        long tmp = f(n, k / 2);
        if (k % 2 == 0) {
            return tmp * tmp;
        } else {
            return n * tmp * tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(f(n, k));
    }
}