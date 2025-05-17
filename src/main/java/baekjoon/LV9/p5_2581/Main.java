package baekjoon.LV9.p5_2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int min = 0;
        int max = 0;
        boolean chack = true;
        for (int i = n; i <= m; i++) {
            boolean chack2 = true;
            if (i >= 2) {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        chack2 = false;
                        break;
                    }
                }
                if (chack2) {
                    max += i;
                    if (chack) {
                        min = i;
                        chack = false;
                    }
                }
            }
        }
        if (max != 0) {
            bw.write(max + "\n");
            bw.write(min + "");
        } else {
            bw.write("-1");
        }
        bw.flush();
    }
}