package baekjoon.LV3.p7_11021;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= n; i++) {
            String s = bf.readLine();
            String[] numbers = s.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            bw.write(String.valueOf("Case #" + i + ": " + (a + b)));
            bw.newLine();
        }
        bw.flush();
    }
}