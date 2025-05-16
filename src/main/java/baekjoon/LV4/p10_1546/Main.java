package baekjoon.LV4.p10_1546;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] tmp = bf.readLine().split(" ");
        double[] tmpN = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            tmpN[i] += Integer.parseInt(tmp[i]);
        }
        Arrays.sort(tmpN);
        double max = tmpN[tmpN.length - 1];
        for (int i = 0; i < n; i++) {
            sum += tmpN[i] / max;
        }
        bw.write((sum * 100 / n) + "");
        bw.flush();
    }
}