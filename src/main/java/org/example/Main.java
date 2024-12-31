package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[][] tmps = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] tmps2 = bf.readLine().split(" ");
            tmps[i][0] = tmps2[0];
            tmps[i][1] = tmps2[1];
        }

        Arrays.sort(tmps, (a1, a2) -> Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]));

        for (int i = 0; i < n; i++) {
            bw.write(tmps[i][0] + " " + tmps[i][1]);
            bw.newLine();
        }

        bw.flush();
    }
}