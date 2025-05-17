package baekjoon.LV10.p3_3009;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            String[] tmp = bf.readLine().split(" ");
            x[i] = Integer.parseInt(tmp[0]);
            y[i] = Integer.parseInt(tmp[1]);
        }
        int x2;
        int y2;
        if (x[0] == x[1]) {
            x2 = x[2];
        } else if (x[1] == x[2]) {
            x2 = x[0];
        } else {
            x2 = x[1];
        }
        if (y[0] == y[1]) {
            y2 = y[2];
        } else if (y[1] == y[2]) {
            y2 = y[0];
        } else {
            y2 = y[1];
        }
        bw.write(x2 + " " + y2);
        bw.flush();
    }
}