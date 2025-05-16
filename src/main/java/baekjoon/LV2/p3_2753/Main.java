package baekjoon.LV2.p3_2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sign = 0;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) sign = 1;
        System.out.println(sign);
    }
}