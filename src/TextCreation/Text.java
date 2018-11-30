package TextCreation;

import java.util.Scanner;

public class Text {
    private Sentence[] sentences;
    private String headline;


    public Text(String headline, Sentence[] sentences) {
        this.headline = headline;
        this.sentences = sentences;
    }

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public static Sentence[] getSentences(){
        Sentence[] sentences = new Sentence[2];
        System.out.println("введите два предложения по 2 слова, отделяя каждое слово клавишей Enter");
        for (int i = 0; i < sentences.length ; i++) {
            sentences[i] = new Sentence(Sentence.getSentenceFromUser());
        }
        return sentences;
    }

    public static Sentence addSentences(){
        System.out.println();
        System.out.println("введите предложение из двух слов, которое дополнит текст, разделяя слова ENTER");
        Sentence sentence = new Sentence(Sentence.getSentenceFromUser());
        return sentence;
    }



    public static String getHeadline(){
        System.out.println("введите заголовок текста");
        Scanner scanner = new Scanner(System.in);
        String headline = scanner.nextLine();
        return headline;
    }

    @Override
    public String toString() {
        return "TextCreation.Text{" +
                "headline='" + headline + '\'' +
                '}';
    }

    public static void printText(Text text, Sentence...snt){
            for (int i = 0; i < text.sentences.length; i++) {
                text.sentences[i].printWords(text.sentences[i].getWords());
                System.out.print(". ");
            }
            for (int i = 0; i < snt.length; i++) {
                snt[i].printWords(snt[i].getWords());
            }
    }



//    public static void main(String[] args) {
//        Text text = new Text (getHeadline(), getSentences());
//        System.out.println(text.headline);
//        printText(text);
//        printText(text, addSentences());
//    }


}
