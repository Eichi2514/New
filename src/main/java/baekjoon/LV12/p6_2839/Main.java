package baekjoon.LV12.p6_2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = Integer.parseInt(bf.readLine());
        int count = 0;
        while (tmp >= 0) {
            if (tmp % 5 == 0) {
                count += tmp / 5;
                tmp = 0;
                break;
            }
            tmp -= 3;
            count++;
        }
        if (tmp == 0) {
            bw.write(count + "");
        } else {
            bw.write("-1");
        }
        bw.flush();
    }
}