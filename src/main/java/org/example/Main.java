package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = 1;
        int count = 1;
        while (num1 > num2) {
            num2 += count*6;
            count++;
        }
        bw.write(count + "");
        bw.flush();
    }
}