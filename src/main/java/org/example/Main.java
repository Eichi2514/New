package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String date[] = data.split("[.]");

        int a = Integer.parseInt(date[0]);
        int b = Integer.parseInt(date[1]);

        System.out.printf("%d"+"\n", a);
        System.out.printf("%d", b);
    }
}