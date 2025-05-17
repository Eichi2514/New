package baekjoon.LV10.p6_10101;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        if (a == 60 && b == 60 && c == 60) bw.write("Equilateral");
        else if (a + b + c == 180) {
            if (a == b || a == c || b == c) bw.write("Isosceles");
            else bw.write("Scalene");
        } else bw.write("Error");
        bw.flush();
    }
}