package baekjoon.LV2.p7_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int coin = 0;
        if (a == b && b == c) coin = 10000 + a * 1000;
        else if (a == b || a == c) coin = 1000 + a * 100;
        else if (b == c) coin = 1000 + b * 100;
        else if (a > b && a > c) coin = a * 100;
        else if (b > a && b > c) coin = b * 100;
        else if (c > a && c > b) coin = c * 100;
        System.out.println(coin);
    }
}