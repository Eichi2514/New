package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = Integer.parseInt(bf.readLine());
        String[] tmp2 = bf.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < tmp; i++) {
            int n = Integer.parseInt(tmp2[i]);
            boolean chack = true;
            if (n >= 2) {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        chack = false;
                        break;
                    }
                }
                if (chack) {
                    count++;
                }
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}
