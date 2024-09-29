package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = bf.readLine().split(" ");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        int c = Integer.parseInt(tmp[2]);
        int max;
        if (a >= b && a >= c) max = a;
        else if (b >= a && b >= c) max = b;
        else max = c;
        int sum = a + b + c;
        if (sum - max > max) bw.write(sum + "\n");
        else bw.write((2 * (sum - max) - 1) + "\n");
        bw.flush();
    }
}
