package baekjoon.LV5.p9_2908;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmps = bf.readLine().split(" ");
        int[] n = new int[tmps.length];
        int max;
        for (int i = 0; i < tmps.length; i++) {
            String tmp = "";
            for (int j = tmps[i].length() - 1; j >= 0; j--) {
                tmp += tmps[i].charAt(j);
            }
            n[i] = Integer.parseInt(tmp);
        }
        max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) max = n[i];
        }
        bw.write(max + "");
        bw.flush();
    }
}