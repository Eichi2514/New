package baekjoon.LV15.p1_1934;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = bf.readLine().split(" ");
            int m = Integer.parseInt(s[0]);
            int l = Integer.parseInt(s[1]);

            int a = m;
            int b = l;
            while (b != 0) {
                int tmp = b;
                b = a % b;
                a = tmp;
            }

            int min = (m * l) / a;

            bw.write(min + "\n");
        }
        bw.flush();
    }
}