package TextCreation;

public class Sentence {

    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public static Word[] getSentenceFromUser(){
        Word[] words = new Word[2];
        for (int i = 0; i < words.length ; i++) {
            words[i]=new Word(Word.getWordFromUser());
        }
        return words;
    }


    public static void printWords(Word[] word){
        for (int i = 0; i <word.length ; i++) {
                System.out.print(word[i].getWord() + " ");
            }
        }

}
