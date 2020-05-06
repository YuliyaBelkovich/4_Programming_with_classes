package by.epam.javaIntro.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParse {

    public String[] textParseByLine(String str) {

        Pattern p = Pattern.compile("\\n");
        String [] text = p.split(str);

        return text;
    }

    public void openTag(String line) {
        Pattern p = Pattern.compile("<[\\w=\"\\s]+>");
        Matcher m = p.matcher(line);

        if(m.find()) {
            System.out.print("Open tag: "+m.group());
        }
    }

    public void closeTag(String line) {
        Pattern p = Pattern.compile("</\\w+>");
        Matcher m = p.matcher(line);

        if(m.find()) {
            System.out.print("Close tag: "+m.group());
        }
    }

    public void contentTag(String line) {
        Pattern p = Pattern.compile("[[а-яА-я]+\\s*[!.?,]*]+");
        Matcher m = p.matcher(line);

        if(m.find()) {
            System.out.print(" Tag content: "+m.group()+" ");
        }
    }

    public void emptyTag(String line) {
        Pattern p = Pattern.compile("<\\w+/>");
        Matcher m = p.matcher(line);

        if(m.find()) {
            System.out.print("Tag without body: "+m.group());
        }
    }


    public void textAnalyse(String [] xml) {


        for(int i = 0; i<xml.length;i++) {
            this.openTag(xml[i]);
            this.contentTag(xml[i]);
            this.closeTag(xml[i]);
            this.emptyTag(xml[i]);
            System.out.println("\n");

        }
    }
}

