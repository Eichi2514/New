package baekjoon.LV3.p12_10951;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while ((s = bf.readLine()) != null) {
            String[] numbers = s.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
    }
}