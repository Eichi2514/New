package baekjoon.LV3.p11_10952;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String s = bf.readLine();
            String[] numbers = s.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            if (a == 0 && b == 0) break;
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
    }
}