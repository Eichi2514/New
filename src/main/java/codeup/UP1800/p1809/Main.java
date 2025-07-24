package codeup.UP1800.p1809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        int light = 0;

        for (int i = a; i <= b; i++) {
            int key = i;
            int count = 1;
            while (key > 1) {
                if (key % 2 != 0) {
                    key = (key * 3) + 1;
                } else {
                    key = key / 2;
                }
                count++;
            }
            if (count > light) {
                answer = i;
                light = count;
            }
        }

        System.out.println(answer + " " + light);
    }
}