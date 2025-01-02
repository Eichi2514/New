package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = bf.readLine().split(" ");
        long m = Long.parseLong(s[0]);
        long l = Long.parseLong(s[1]);

        long a = m;
        long b = l;
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }

        long min = (m * l) / a;

        bw.write(min + "\n");

        bw.flush();
    }
}