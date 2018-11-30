package TextCreation;

import java.util.Scanner;

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public static String getWordFromUser(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }



}
