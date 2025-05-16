package baekjoon.LV7.p4_2563;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[][] p = new int[100][100];
        for (int i = 0; i < n; i++) {
            String[] xy = bf.readLine().split(" ");
            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    p[j][k] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (p[i][j] == 1) count++;
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}