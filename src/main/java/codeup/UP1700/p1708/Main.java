package codeup.UP1700.p1708;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];
        int[] ns2 = new int[n];

        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
            ns2[i] = ns[i];
        }

        Arrays.sort(ns2);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = n;
        for (int i = 0; i < n; i++) {
            int tmp = ns2[i];
            map.put(tmp, rank);
            rank--;
        }

        for (int i = 0; i < n; i++) {
            int tmp = ns[i];
            int studentRank = map.get(tmp);
            System.out.println(tmp + " " + studentRank);
        }
    }
}
