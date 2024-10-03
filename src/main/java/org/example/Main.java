package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmps = bf.readLine().split(" ");
        int a1 = Integer.parseInt(tmps[0]);
        int a0 = Integer.parseInt(tmps[1]);
        int c = Integer.parseInt(bf.readLine());
        int n0 = Integer.parseInt(bf.readLine());
        boolean tmp = (a1 > c) ? false : (a1 == c) ? (a0 <= 0) : (a1 * n0 + a0 <= c * n0);
        bw.write(tmp ? "1" : "0");
        bw.flush();
    }
}
