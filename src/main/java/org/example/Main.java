package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        int[][] list = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] tmps = bf.readLine().split(" ");
            list[i][0] = Integer.parseInt(tmps[0]);
            list[i][1] = Integer.parseInt(tmps[1]);
        }

        Arrays.sort(list, (a1, a2) -> a1[1] - a2[1]);
        Arrays.sort(list, (a1, a2) -> a1[0] - a2[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(list[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
    }
}