package codeup.UP1700.p1707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[10];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            ns[i] = sc.nextInt();
            sum += ns[i];
        }

        sum /= 10;
        int t = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            if (ns[i] >= sum) t++;
            else b++;
        }

        System.out.println(sum);
        System.out.println(t + " " + b);
    }
}