package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) count++;
        }
        if (count == 1) System.out.println("도");
        else if (count == 2) System.out.println("개");
        else if (count == 3) System.out.println("걸");
        else if (count == 4) System.out.println("윷");
        else System.out.println("모");
    }
}