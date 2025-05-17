package baekjoon.LV10.p5_9063;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            String[] tmp = bf.readLine().split(" ");
            x[i] = Integer.parseInt(tmp[0]);
            y[i] = Integer.parseInt(tmp[1]);
        }
        int xMin = x[0];
        int xMax = x[0];
        int yMin = y[0];
        int yMax = y[0];
        for (int i = 0; i < n; i++) {
            if (x[i] < xMin) {
                xMin = x[i];
            }
            if (x[i] > xMax) {
                xMax = x[i];
            }
            if (y[i] < yMin) {
                yMin = y[i];
            }
            if (y[i] > yMax) {
                yMax = y[i];
            }
        }
        int asdf = (xMax - xMin) * (yMax - yMin);
        if (n > 1) bw.write(asdf + "");
        else bw.write(0 + "");
        bw.flush();
    }
}