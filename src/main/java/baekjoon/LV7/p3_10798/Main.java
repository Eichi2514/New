package baekjoon.LV7.p3_10798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] tmpss = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String[] tmps = bf.readLine().split("");
            for (int j = 0; j < tmps.length; j++) {
                tmpss[i][j] = tmps[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (tmpss[j][i] != null) bw.write(tmpss[j][i]);
            }
        }
        bw.flush();
    }
}