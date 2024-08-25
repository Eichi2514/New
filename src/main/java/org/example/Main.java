package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        int count = 1;
        int tmp1 = 1;
        int tmp2 = 1;
        while (num > count) {
            num -= count;
            count++;
        }
        if (count == 1) {
        }
        else if (count % 2 == 0) {
            tmp2 = count;
            for (int i = 0; i < num-1; i++) {
             tmp1++;
             tmp2--;
            }
        } else {
            tmp1 = count;
            for (int i = 0; i < num-1; i++) {
                tmp1--;
                tmp2++;
            }
        }
        bw.write(tmp1 + "/" + tmp2);
        bw.flush();
    }
}