package by.epam.javaIntro.task;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sort {

    public String[] sortPar(String[] parText) {
        TextParse par = new TextParse();

        for(int i =parText.length-1; i>0;i--) {
            for(int j =0;j<i;j++) {

                if(par.sentence(parText[j]).length>par.sentence(parText[j+1]).length) {
                    String tmp = parText[j];
                    parText[j]=parText[j+1];
                    parText[j+1]=tmp;
                }

            }
        }
        return parText;
    }

    public String[] sortEachSent(String sent) {
        TextParse par = new TextParse();
        String [] sentWord = par.word(sent);

        for(int i =sentWord.length-1; i>0;i--) {
            for(int j =0;j<i;j++) {

                if(sentWord[j].length()>sentWord[j+1].length()) {
                    String tmp = sentWord[j];
                    sentWord[j] = sentWord[j+1];
                    sentWord[j+1] = tmp;
                }
            }
        }

        return sentWord;

    }

    public String[] sortLex(String sent, String a) {
        TextParse par = new TextParse();
        String [] sentWord = par.word(sent);
        Pattern p = Pattern.compile(a);

        Arrays.sort(sentWord, String.CASE_INSENSITIVE_ORDER);

        for(int i =sentWord.length-1; i>0;i--) {
            for(int j =0;j<i;j++) {

                Matcher m =  p.matcher(sentWord[j]);
                int count = 0;

                while(m.find()) {
                    count++;
                }

                Matcher m1 =  p.matcher(sentWord[j+1]);
                int count1 = 0;

                while(m1.find()) {
                    count1++;
                }

                if (count<count1) {
                    String tmp = sentWord[j];
                    sentWord[j] = sentWord[j+1];
                    sentWord[j+1] = tmp;
                }
            }
        }

        return sentWord;
    }
}

