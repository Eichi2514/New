package codeup.UP1200.p1226;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        int[] my = new int[6];
        for (int i = 0; i < 6; i++) {
            int tmp = sc.nextInt();
            lotto[i] = tmp;
        }
        int bo = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            int tmp = sc.nextInt();
            my[i] = tmp;
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lotto[i] == my[j]) {
                    count++;
                }
            }
        }
        if (count != 5) {
            if (count <= 2) System.out.println(0);
            else if (count == 3) System.out.println(5);
            else if (count == 4) System.out.println(4);
            else if (count == 6) System.out.println(1);
        } else if (count == 5) {
            for (int i = 0; i < 6; i++) {
                if (bo == my[i]) {
                    count++;
                }
            }
            if (count == 5) System.out.println(3);
            else if (count == 6) System.out.println(2);
        }
    }
}