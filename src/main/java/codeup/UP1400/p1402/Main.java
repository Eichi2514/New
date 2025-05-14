package codeup.UP1400.p1402;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }
    }
}