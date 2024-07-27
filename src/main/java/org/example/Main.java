package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++){
                bw.write(" ");
            }
            for (int j = 0; j < (i*2)+1; j++){
                bw.write("*");
            }bw.newLine();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n-i; j > 0; j--){
                bw.write(" ");
            }
            for (int j = ((i-1)*2)+1; j > 0; j--){
                bw.write("*");
            }bw.newLine();
        }
        bw.flush();
    }
}