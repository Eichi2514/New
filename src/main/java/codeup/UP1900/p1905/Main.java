package codeup.UP1900.p1905;

import java.util.Scanner;

public class Main {

    public static void f(int start, int end, long sum) {
        if (start > end) {
            System.out.println(sum);
            return;
        }

        f(start + 1, end, sum + start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = sc.nextInt();
        long sum = 0;
        f(start, end, sum);
    }
}