package org.example;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(bf.readLine());
        String[] strs1 = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (map.get(strs1[i]) != null) count = map.get(strs1[i]) + 1;
            map.put(strs1[i], count);
        }

        int m = Integer.parseInt(bf.readLine());
        String[] strs2 = bf.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            if (map.get(strs2[i]) == null) {
                bw.write("0 ");
            } else {
                bw.write(map.get(strs2[i]) + " ");
            }
        }

        bw.flush();
    }
}