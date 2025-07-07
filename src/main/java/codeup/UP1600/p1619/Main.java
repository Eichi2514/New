package codeup.UP1600.p1619;

import java.util.Scanner;

public class Main {

    public static int S(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = S(n);

        if (n % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}