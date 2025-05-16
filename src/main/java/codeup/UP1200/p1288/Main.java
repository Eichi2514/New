package codeup.UP1200.p1288;

import java.util.*;

public class Main {

    public static int sub(int n) {
        int sum = 1;
        if (n == 0) return sum;
        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(sub(n) / (sub(r) * sub(n - r)));
    }
}