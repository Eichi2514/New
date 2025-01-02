package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = bf.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        String[] strA = bf.readLine().split(" ");
        String[] strB = bf.readLine().split(" ");

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(strA[i]));
        }

        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(strB[i]));
        }

        Set<Integer> uniqueA = new HashSet<>(setA);
        uniqueA.removeAll(setB);

        Set<Integer> uniqueB = new HashSet<>(setB);
        uniqueB.removeAll(setA);

        int count = uniqueA.size() + uniqueB.size();

        bw.write(count + "");
        bw.flush();
    }
}
