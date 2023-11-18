package wordsfromtext;


public class Main {
    public static final String NAME_OF_TEXTFILE = "gameOfThrones(01-05seasons).txt";
    public static final int MIN_FREQUENCY = 3;
    public static final int MAX_FREQUENCY = 1500;

    public static void main(String [] args){
        FrequencyWordsFromText.getWords(NAME_OF_TEXTFILE, MIN_FREQUENCY, MAX_FREQUENCY);
    }
}
