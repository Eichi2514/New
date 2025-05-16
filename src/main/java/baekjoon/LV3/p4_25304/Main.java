package baekjoon.LV3.p4_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        String X = "No";
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum += b * c;
        }
        if (sum == a) X = "Yes";
        System.out.println(X);
    }
}