package codeup.UP1600.p1676;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] ns = new Integer[n];
        int[] origin = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            ns[i] = tmp;
            origin[i] = tmp;
        }

        Arrays.sort(ns, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (map.get(ns[i]) == null) {
                map.put(ns[i], i + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(map.get(origin[i]));
        }
    }
}