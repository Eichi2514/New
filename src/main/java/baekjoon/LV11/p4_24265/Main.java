package baekjoon.LV11.p4_24265;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Integer.parseInt(bf.readLine());
        bw.write((n * (n - 1) / 2) + "\n");
        bw.write("2");
        bw.flush();
    }
}