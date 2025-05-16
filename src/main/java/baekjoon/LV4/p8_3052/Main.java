package baekjoon.LV4.p8_3052;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(bf.readLine()) % 42;
        }
        int count = 10;
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 10; j++) {
                if (n[i] == n[j] && n[j] != -1) {
                    if (i != j) {
                        n[j] = -1;
                        count--;
                    }
                }
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}