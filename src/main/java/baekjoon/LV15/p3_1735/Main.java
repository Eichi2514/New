package baekjoon.LV15.p3_1735;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = bf.readLine().split(" ");
        long A1 = Long.parseLong(s[0]);
        long B1 = Long.parseLong(s[1]);

        String[] c = bf.readLine().split(" ");
        long A2 = Long.parseLong(c[0]);
        long B2 = Long.parseLong(c[1]);

        long A = A1 * B2 + A2 * B1;
        long B = B1 * B2;

        long a = A;
        long b = B;

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        A /= a;
        B /= a;

        bw.write(A + " " + B);

        bw.flush();
    }
}