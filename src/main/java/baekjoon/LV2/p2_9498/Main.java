package baekjoon.LV2.p2_9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sign = "F";
        if (a > 89) sign = "A";
        else if (a > 79) sign = "B";
        else if (a > 69) sign = "C";
        else if (a > 59) sign = "D";
        System.out.println(sign);
    }
}