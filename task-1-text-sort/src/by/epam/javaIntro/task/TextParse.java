package by.epam.javaIntro.task;

import java.util.regex.Pattern;

public class TextParse {

    public String[] paragraph(String text) {

        Pattern pattern = Pattern.compile("\\n");
        String [] parText = pattern.split(text);

        return parText;
    }

    public String[] sentence(String text) {

        Pattern pattern = Pattern.compile("[.!?]");
        String [] sentText = pattern.split(text);

        return sentText;
    }

    public String[] word(String sentence) {

        Pattern pattern = Pattern.compile("\\s");
        String[] wordText = pattern.split(sentence.trim());

        return wordText;
    }
}

