package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[] tmps = new String[n];
        for (int i = 0; i < n; i++) {
            String str = bf.readLine();
            tmps[i] = str;
        }

        tmps = Arrays.stream(tmps).distinct().toArray(String[]::new);

        Arrays.sort(tmps);

        int max = 0;

        for (int i = 0; i < tmps.length; i++) {
            if (tmps[i].length() > max) max = tmps[i].length();
        }

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < tmps.length; j++) {
                if (tmps[j].length() == i){
                    bw.write(tmps[j]);
                    bw.newLine();
                }
            }
        }

        bw.flush();
    }
}