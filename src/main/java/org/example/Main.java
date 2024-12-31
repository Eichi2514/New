package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmps = bf.readLine().split(" ");

        int n = Integer.parseInt(tmps[0]);
        int m = Integer.parseInt(tmps[1]);

        String[] tmps1 = new String[n];
        String[] tmps2 = new String[m];

        for (int i = 0; i < n; i++) {
            String tmp = bf.readLine();
            tmps1[i] = tmp;
        }

        for (int i = 0; i < m; i++) {
            String tmp = bf.readLine();
            tmps2[i] = tmp;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tmps1[i].equals(tmps2[j])) count++;
            }
        }

        bw.write(count + " ");
        bw.flush();
    }
}