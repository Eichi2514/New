package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] tmp = bf.readLine().split(" ");
            if (tmp[0].equals("0") && tmp[1].equals("0") && tmp[2].equals("0")) break;
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);
            if (a >= b + c || b >= a + c || c >= a + b) bw.write("Invalid\n");
            else if (a == b && b == c && a == c) bw.write("Equilateral\n");
            else if (a == b || a == c || b == c) bw.write("Isosceles\n");
            else bw.write("Scalene\n");
        }
        bw.flush();
    }
}