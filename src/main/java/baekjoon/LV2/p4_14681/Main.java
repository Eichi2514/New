package baekjoon.LV2.p4_14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sign = 4;
        if (a > 0 && b > 0) sign = 1;
        else if (a < 0 && b > 0) sign = 2;
        else if (a < 0 && b < 0) sign = 3;
        System.out.println(sign);
    }
}