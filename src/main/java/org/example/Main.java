package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmps = bf.readLine().split(" ");
        int a = Integer.parseInt(tmps[0]);
        int b = Integer.parseInt(tmps[1]);
        int c = Integer.parseInt(tmps[2]);
        int d = Integer.parseInt(tmps[3]);
        int e = Integer.parseInt(tmps[4]);
        int f = Integer.parseInt(tmps[5]);
        int g = a * e - b * d;
        int x = (c * e - b * f) / g;
        int y = (a * f - c * d) / g;
        bw.write(x + " " + y);
        bw.flush();
    }
}