package codeup.UP1200.p1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n >= 1) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}