package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        int count = 0;
        String b = "0";
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == tmp.charAt(tmp.length()-i-1)) {
                count++;
            }
        }
        if (count == tmp.length()) b = "1";
        bw.write(b);
        bw.flush();
    }
}