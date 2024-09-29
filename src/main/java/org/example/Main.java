package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int a = 2;
        while (n > 1) {
            if (n % a == 0) {
                bw.write(a + "\n");
                n /= a;
            } else {
                a++;
            }
        }
        bw.flush();
    }
}
