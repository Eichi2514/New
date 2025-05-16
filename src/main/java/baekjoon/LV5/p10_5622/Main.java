package baekjoon.LV5.p10_5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        int count = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == 'A' || tmp.charAt(i) == 'B' || tmp.charAt(i) == 'C') count += 3;
            else if (tmp.charAt(i) == 'D' || tmp.charAt(i) == 'E' || tmp.charAt(i) == 'F') count += 4;
            else if (tmp.charAt(i) == 'G' || tmp.charAt(i) == 'H' || tmp.charAt(i) == 'I') count += 5;
            else if (tmp.charAt(i) == 'J' || tmp.charAt(i) == 'K' || tmp.charAt(i) == 'L') count += 6;
            else if (tmp.charAt(i) == 'M' || tmp.charAt(i) == 'N' || tmp.charAt(i) == 'O') count += 7;
            else if (tmp.charAt(i) == 'P' || tmp.charAt(i) == 'Q' || tmp.charAt(i) == 'R' || tmp.charAt(i) == 'S')
                count += 8;
            else if (tmp.charAt(i) == 'T' || tmp.charAt(i) == 'U' || tmp.charAt(i) == 'V') count += 9;
            else if (tmp.charAt(i) == 'W' || tmp.charAt(i) == 'X' || tmp.charAt(i) == 'Y' || tmp.charAt(i) == 'Z')
                count += 10;
        }
        bw.write(count + "");
        bw.flush();
    }
}