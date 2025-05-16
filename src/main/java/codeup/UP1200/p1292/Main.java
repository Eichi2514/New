package codeup.UP1200.p1292;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long DNA = sc.nextLong();
        int sum = 0;

        while (DNA > 0) {
            sum += DNA % 10;
            DNA /= 10;
        }

        System.out.print(sum % 7 == 4 ? "suspect" : "citizen");
    }
}