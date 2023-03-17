package com.bridgelabz.algorithm_programs;

public class StringPermutations {
    public static void main(String[] args) {
        String inputString = "AKS";
        StringPermutations stringPermutations = new StringPermutations();
        stringPermutations.permuteRecursion(inputString, 0, inputString.length() - 1);
        stringPermutations.permuteIteration(inputString, 0, inputString.length() - 1);

    }

    public void permuteRecursion(String string, int min, int max) {
        if (min == max) {
            System.out.println(string);
        } else {
            for (int i = min; i <= max; i++) {
                string = swapString(string, min, max);
                permuteRecursion(string, min + 1, max);
            }
        }
    }

    public String swapString(String string, int i, int j) {
        char temp;
        char[] charArray = string.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public void permuteIteration(String inputString, int min, int max) {
        for (int a = min; a <= max; a++) {
            char[] inputStrArray = inputString.toCharArray();
            for (int i = 0; i < max ; i++) {
                char temp;
                temp = inputStrArray[i];
                inputStrArray[i] = inputStrArray[i + 1];
                inputStrArray[i + 1] = temp;
                inputString = String.valueOf(inputStrArray);
                System.out.println(inputString);
            }
        }
    }
}
