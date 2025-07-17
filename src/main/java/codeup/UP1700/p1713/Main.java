package codeup.UP1700.p1713;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        for (int i = n1; i <= n2; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (i % 4 == 0) {
                sum -= i;
            }
        }

        System.out.println(sum);
    }
}