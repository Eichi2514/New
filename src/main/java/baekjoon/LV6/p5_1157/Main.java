package baekjoon.LV6.p5_1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[26];
        String tmps = bf.readLine().toUpperCase();
        for (int i = 0; i < tmps.length(); i++) {
            if (65 <= tmps.charAt(i) && tmps.charAt(i) <= 90) {
                n[tmps.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char b = '?';
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
                b = (char) (i + 65);
            } else if (n[i] == max) {
                b = '?';
            }
        }
        bw.write(b);
        bw.flush();
    }
}