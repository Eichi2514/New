package codeup.UP1600.p1677;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (j == 0 && i == 0 || j == 0 && i == y - 1 || j == x - 1 && i == 0 || j == x - 1 && i == y - 1)
                    System.out.print("+");
                else if (i == 0 || i == y - 1) System.out.print("-");
                else if (j == 0 || j == x - 1) System.out.print("|");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}