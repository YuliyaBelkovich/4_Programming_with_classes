package by.epam.javaIntro.tour;

import java.io.FileNotFoundException;

public class Main {

    /*Туристические путевки.
    Сформировать набор предложений клиенту по выбору туристической путевки различного типа
    (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
    Учитывать возможность выбора транспорта, питания и числа дней.
    Реализовать выбор и сортировку путевок.
     */

    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        menu.startMenu();
        menu.chooseDuration();
        menu.chooseTransport();
        System.out.println("Selected tour: "+ menu.getTours().getCurrentSuggestion().toString());
    }
}
