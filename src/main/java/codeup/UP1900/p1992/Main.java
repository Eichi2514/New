package codeup.UP1900.p1992;

import java.util.Scanner;

public class Main {
    static Long f(Long n, Long m) {
        while (m != 0) {
            Long c = (n & m) << 1;
            n = n ^ m;
            m = c;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long m = sc.nextLong();
        System.out.println(f(n, m));
    }
}