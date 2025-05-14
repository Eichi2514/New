package codeup.UP1400.p1403;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            for (int a : arr) {
                System.out.println(a);
            }
        }
    }
}