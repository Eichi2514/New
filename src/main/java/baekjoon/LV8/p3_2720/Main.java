package baekjoon.LV8.p3_2720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(bf.readLine());
            int Q = 0;
            while (tmp >= 25) {
                tmp -= 25;
                Q++;
            }
            bw.write(Q + " ");
            int D = 0;
            while (tmp >= 10) {
                tmp -= 10;
                D++;
            }
            bw.write(D + " ");
            int N = 0;
            while (tmp >= 5) {
                tmp -= 5;
                N++;
            }
            bw.write(N + " ");
            int P = 0;
            while (tmp >= 1) {
                tmp -= 1;
                P++;
            }
            bw.write(P + "");
            bw.newLine();
        }
        bw.flush();
    }
}