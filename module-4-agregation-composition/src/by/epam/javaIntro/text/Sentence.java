package by.epam.javaIntro.text;

public class Sentence {

    private String sentence;

    public Sentence(Word...words){
        for(Word word: words){
            this.sentence +=word.getWord();
        }
        this.sentence+=".";
    }

    public String getSentence() {
        return sentence;
    }
}

