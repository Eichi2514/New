package org.example;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = 2;
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum = ((num2*2)-1)*((num2*2)-1);
            num2 = (num2*2)-1;
        }
        bw.write(sum+"");
        bw.flush();
    }
}