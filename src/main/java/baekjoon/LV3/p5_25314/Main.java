package baekjoon.LV3.p5_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a >= 4) {
            System.out.print("long ");
            a -= 4;
        }
        System.out.print("int");
    }
}