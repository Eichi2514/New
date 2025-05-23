package codeup.UP1400.p1430;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            int n3 = sc.nextInt();
            if (countMap.containsKey(n3) && countMap.get(n3) > 0) {
                System.out.print("1 ");
                countMap.put(n3, countMap.get(n3) - 1);
            } else {
                System.out.print("0 ");
            }
        }
    }
}