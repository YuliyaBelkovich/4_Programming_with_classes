package by.epam.javaIntro.text;

public class Text {

    /*Создать объект класса Текст,
    используя классы Предложение, Слово.
    Методы: дополнить текст, вывести на консоль текст, заголовок текста.
     */

    private String text;
    private String heading;

    public Text(String heading, Sentence... sentences){
        this.heading=heading;

        for(Sentence sentence:sentences){
            this.text+=sentence.getSentence()+" ";
        }
    }

    public void addText(String add){
        this.text+=add;
    }

    public void printHeading(){
        System.out.println(this.heading);
    }

    public void printText(){
        System.out.println(this.heading+"\n");
        System.out.println("text");
    }
}

