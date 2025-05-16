package codeup.UP1000.p1095;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println(Collections.min(list));
    }
}