package main.java.wordsfromtext;


public class Main {
    public static final String NAME_OF_TEXTFILE = "HPSorcerersStone.txt";
    public static final int MIN_FREQUENCY = 5;
    public static final int MAX_FREQUENCY = 1000;

    public static void main(String [] args){
        FrequencyWordsFromText.getWords(NAME_OF_TEXTFILE, MIN_FREQUENCY, MAX_FREQUENCY);
    }
}
