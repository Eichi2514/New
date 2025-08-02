package codeup.UP1900.p1929;

import java.util.*;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void f(int n) {
        list.add(n);
        if (n == 1) {
            return;
        }

        if (n % 2 == 0) f(n / 2);
        else f(n * 3 + 1);
    }

    public static void fo(int n) {
        if (n == list.size()) return;

        System.out.println(list.get(list.size() - 1 - n));
        fo(n + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        f(n);
        fo(0);
    }
}