package codeup.UP1800.p1805;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();

            map.put(key, value);
        }

        Map<Integer, Integer> sortedMap = new TreeMap<>(map);

        for (int key : sortedMap.keySet()) {
            System.out.println(key + " " + sortedMap.get(key));
        }
    }
}