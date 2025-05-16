package baekjoon.LV5.p8_1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmps = bf.readLine().split(" ");
        int n = tmps.length;
        for (int i = 0; i < tmps.length; i++) {
            if (tmps[i].equals("")) {
                n--;
            }
        }
        bw.write(n + "");
        bw.flush();
    }
}