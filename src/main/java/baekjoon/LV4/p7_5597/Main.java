package baekjoon.LV4.p7_5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[30];
        for (int i = 0; i < 30; i++) {
            n[i] = i + 1;
        }
        String tmp;
        while ((tmp = bf.readLine()) != null) {
            for (int i = 0; i < 30; i++) {
                if (n[i] == Integer.parseInt(tmp)) {
                    n[i] = 0;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            if (n[i] != 0) {
                bw.write(n[i] + "");
                bw.newLine();
            }
        }
        bw.flush();
    }
}