package programmers.LV0.p120838;

class Solution {
    public static String solution(String letter) {
        String[] code = letter.split(" ");
        String answer = "";

        for (int i = 0; i < code.length; i++) {
            if (code[i].equals(".-")) code[i] = "a";
            else if (code[i].equals("-...")) code[i] = "b";
            else if (code[i].equals("-.-.")) code[i] = "c";
            else if (code[i].equals("-..")) code[i] = "d";
            else if (code[i].equals(".")) code[i] = "e";
            else if (code[i].equals("..-.")) code[i] = "f";
            else if (code[i].equals("--.")) code[i] = "g";
            else if (code[i].equals("....")) code[i] = "h";
            else if (code[i].equals("..")) code[i] = "i";
            else if (code[i].equals(".---")) code[i] = "j";
            else if (code[i].equals("-.-")) code[i] = "k";
            else if (code[i].equals(".-..")) code[i] = "l";
            else if (code[i].equals("--")) code[i] = "m";
            else if (code[i].equals("-.")) code[i] = "n";
            else if (code[i].equals("---")) code[i] = "o";
            else if (code[i].equals(".--.")) code[i] = "p";
            else if (code[i].equals("--.-")) code[i] = "q";
            else if (code[i].equals(".-.")) code[i] = "r";
            else if (code[i].equals("...")) code[i] = "s";
            else if (code[i].equals("-")) code[i] = "t";
            else if (code[i].equals("..-")) code[i] = "u";
            else if (code[i].equals("...-")) code[i] = "v";
            else if (code[i].equals(".--")) code[i] = "w";
            else if (code[i].equals("-..-")) code[i] = "x";
            else if (code[i].equals("-.--")) code[i] = "y";
            else if (code[i].equals("--..")) code[i] = "z";
        }

        for (int i = 0; i < code.length; i++) {
            answer += code[i];
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(".... . .-.. .-.. ---"));
        System.out.println(new Solution().solution(".--. -.-- - .... --- -."));
    }
}