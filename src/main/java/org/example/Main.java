package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = (a+b+c/3);

        System.out.printf("%.0f\n",a+b+c);
        System.out.printf("%.1f\n",d);
    }
}