package codeup.UP1600.p1679;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> tSet = new HashSet<>();

        for (int i = 1; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                int k = n - i - j;
                if (i + j > k && i + k > j && j + k > i) {
                    int[] ns = {i, j, k};
                    Arrays.sort(ns);
                    tSet.add(ns[0] + " " + ns[1] + " " + ns[2]);
                }
            }
        }

        if (tSet.isEmpty()) {
            System.out.println(-1);
        } else {
            ArrayList<int[]> ts = new ArrayList<>();

            for (String t : tSet) {
                String[] parts = t.split(" ");
                int[] sides = new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])};
                ts.add(sides);
            }

            ts.sort((a, b) -> {
                for (int i = 0; i < 3; i++) {
                    if (a[i] != b[i]) {
                        return a[i] - b[i];
                    }
                }
                return 0;
            });

            for (int[] triangle : ts) {
                System.out.println(triangle[0] + " " + triangle[1] + " " + triangle[2]);
            }
        }
    }
}