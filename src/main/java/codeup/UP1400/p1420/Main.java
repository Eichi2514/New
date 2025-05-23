package codeup.UP1400.p1420;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            m.put(ss[0], Integer.parseInt(ss[1]));
        }

        List<Map.Entry<String, Integer>> e = new ArrayList<>(m.entrySet());
        e.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(e.get(2).getKey());
    }
}