package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //고정
        String data = sc.nextLine();
        for (int a = 0; a <= 100; a++)
            System.out.println(data +":"+ a);
    }
}