package codeup.UP1000.p1078;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("%d \n", sum);
    }
}