package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 % 2 == 0) {
            if (n2 % 2 == 0) System.out.println("짝수+짝수=짝수");
            else System.out.println("짝수+홀수=홀수");
        } else {
            if (n2 % 2 == 0) System.out.println("홀수+짝수=홀수");
            else System.out.println("홀수+홀수=짝수");
        }
    }
}