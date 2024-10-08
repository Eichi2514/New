package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] tmps = {a, b};
        Arrays.sort(tmps);
        for (int i = tmps[0]; i <= tmps[1]; i++) {
            System.out.print(i + " ");
        }
    }
}