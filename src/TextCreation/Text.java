package TextCreation;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    private ArrayList<Sentence> sentencesOfTheText;
    private String headline;

    public Text(ArrayList<Sentence> sentencesOfTheText, String headline) {
        this.sentencesOfTheText = sentencesOfTheText;
        this.headline = headline;
    }

    public static void main(String[] args) {

        ArrayList<Word> words1 = new ArrayList<>();
        ArrayList<Word> words2 = new ArrayList<>();


        words1.add(new Word("Первое"));
        words1.add(new Word("слово"));
        words1.add(new Word("первого"));
        words1.add(new Word("предложения"));
        words2.add(new Word("Первое"));
        words2.add(new Word("слово"));
        words2.add(new Word("второго"));
        words2.add(new Word("предложения"));

        Sentence sentence1 = new Sentence(words1);
        Sentence sentence2 = new Sentence(words2);

        ArrayList<Sentence> sentences = new ArrayList<>();

        sentences.add(sentence1);
        sentences.add(sentence2);

        Text text = new Text(sentences, "Заголовок текста");

        printHeadline(text);
        printTheText(text);
        addSentencetoTheText(sentenceFromUser(), text);
        printTheText(text);

    }

    public static Sentence sentenceFromUser(){
        ArrayList<Word> words = new ArrayList<>();
        String str;
        System.out.println("Введите предложение, которым дополним текст,после каждого слова нажмине ENTER, в конце введите точку");
        Scanner scanner = new Scanner(System.in);
        do {
            str = scanner.next();
            if (str.equals(".")){break;}
            words.add(new Word(str));
        }while (!str.equals("."));
        Sentence sentence = new Sentence(words);

        return sentence;
    }

    public static void addSentencetoTheText(Sentence sentence, Text text){
        text.sentencesOfTheText.add(sentence);
    }

    public static void printTheText(Text text){
        for (Sentence sentence: text.sentencesOfTheText) {
            Sentence.printTheSentence(sentence);
        }
    }

    public static void printHeadline(Text text){
        System.out.println(text.headline);
    }





}
