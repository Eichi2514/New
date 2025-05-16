package baekjoon.LV6.p8_25206;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double q = 0;
        double sum = 0;
        String tmp;
        while ((tmp = bf.readLine()) != null) {
            String[] tmps = tmp.split(" ");
            double c = 0;
            double g = 0;
            c += Double.parseDouble(tmps[1]);

            if (tmps[2].contains("A")) {
                if (tmps[2].contains("+")) g += 4.5;
                else g += 4.0;
            } else if (tmps[2].contains("B")) {
                if (tmps[2].contains("+")) g += 3.5;
                else g += 3.0;
            } else if (tmps[2].contains("C")) {
                if (tmps[2].contains("+")) g += 2.5;
                else g += 2.0;
            } else if (tmps[2].contains("D")) {
                if (tmps[2].contains("+")) g += 1.5;
                else g += 1.0;
            } else if (tmps[2].contains("P")) {
                c = 0;
            }
            sum += c;
            q += c * g;
        }
        double e = q;
        if (sum != 0) e = q / sum;
        bw.write(e + "");
        bw.flush();
    }
}