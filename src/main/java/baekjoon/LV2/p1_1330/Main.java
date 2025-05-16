package baekjoon.LV2.p1_1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sign = "";
        if (a > b) sign = ">";
        else if (a == b) sign = "==";
        else if (a < b) sign = "<";
        System.out.println(sign);
    }
}