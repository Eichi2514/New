package codeup.UP1600.p1672;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while (n >= k) {
            count++;
            n -= k;
        }

        if (count > 9999) {
            System.out.println("번호 초과 오류");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.printf("F-%04d%n", i);
            }
        }
    }
}