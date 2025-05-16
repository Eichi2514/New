package codeup.UP1100.p1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.printf("%.2f", ((n1 + n2 + n3) / 3));
    }
}