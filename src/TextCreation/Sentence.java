package TextCreation;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> wordsOfTheSentence;


    public Sentence(ArrayList<Word> wordsOfTheSentence) {
        this.wordsOfTheSentence = wordsOfTheSentence;
    }

    public static void printTheSentence(Sentence sentence){
        for (Word word: sentence.wordsOfTheSentence) {
            System.out.print(word.getWord() + " ");
        }
        System.out.println(". ");
    }
}
