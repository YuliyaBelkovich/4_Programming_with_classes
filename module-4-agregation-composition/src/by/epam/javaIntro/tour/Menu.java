package by.epam.javaIntro.tour;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private TourCatalog tours;
    {
        try {
            this.tours = new TourCatalog();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Menu(){}

    public void startMenu() throws FileNotFoundException {
        System.out.println("Choose action:\n"+
                "1. Show full list of tours and sort it\n"+
                "1. Choose tour according to your personal settings\n");


        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            try {
                tmp = sc.nextInt();
                System.out.println(tmp);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
        }
        switch(tmp){

            case 1: {
                System.out.println(this.tours.getCurrentSuggestion().toString());
                chooseSort();
                break;

            }
            case 2: {
                chooseType();
                break;
            }
        }



    }

    public void chooseSort(){
        System.out.println("Sort tours by:\n"+
                "1. Price\n"+
                "2. Transport\n"+
                "3. Type of nutrition\n"+
                "4. Duration\n");
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            try {
                tmp = sc.nextInt();
                System.out.println(tmp);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
        }
        switch(tmp){
            case 1: {
                tours.sortTourByPrice(tours.getCurrentSuggestion());
                System.out.println(this.tours.getCurrentSuggestion().toString());
                break;
            }
            case 2: {
                tours.sortTourByTransport(tours.getCurrentSuggestion());
                System.out.println(this.tours.getCurrentSuggestion().toString());
                break;
            }
            case 3: {
                tours.sortTourByNutrition(tours.getCurrentSuggestion());
                System.out.println(this.tours.getCurrentSuggestion().toString());
                break;
            }
            case 4: {
                tours.sortTourByDuration(tours.getCurrentSuggestion());
                System.out.println(this.tours.getCurrentSuggestion().toString());
                break;
            }
        }

    }

    public void chooseType() throws FileNotFoundException {
        System.out.println("Choose tour type:\n" +
                "1.Hiking\n" +
                "2.Excursion\n" +
                "3.Sea\n" +
                "4.Health\n" +
                "5.Shopping\n" +
                "6.Cruise\n");

        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            try {
                tmp = sc.nextInt();
                System.out.println(tmp);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
        }

            switch (tmp) {
                case 1: {
                    this.tours.suggestTourByType("hiking");
                    break;
                }
                case 2: {
                    this.tours.suggestTourByType("excursion");
                    break;
                }
                case 3: {
                    this.tours.suggestTourByType("sea");
                    break;
                }
                case 4: {
                    this.tours.suggestTourByType("health");
                    break;
                }
                case 5: {
                    this.tours.suggestTourByType("shopping");
                    break;
                }
                case 6: {
                    this.tours.suggestTourByType("cruise");
                    break;
                }
            }
        }


    public void chooseDuration() throws FileNotFoundException {
        System.out.println("Choose duration: \n"+
                            "1. 5 days\n"+
                            "2. 7 days\n");
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            try {
                tmp = sc.nextInt();
                System.out.println(tmp);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
        }
        switch(tmp)
        {
            case 1: {
                    this.tours.suggestTourByDuration(5);
                    break;
            }
            case 2 : {
                this.tours.suggestTourByDuration(7);
                break;
            }
        }
    }

    public void chooseTransport() throws FileNotFoundException {
        System.out.println("Choose transport:\n"+
                            "1. Bus\n"+
                            "2. Plane\n");
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            try {
                tmp = sc.nextInt();
                System.out.println(tmp);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
        }
        switch(tmp)
        {
            case 1 : {
                this.tours.suggestTourByTransport("bus");
                break;
            }
            case 2 : {
                this.tours.suggestTourByTransport("plane");
                break;
            }
        }
    }

    public TourCatalog getTours() {
        return tours;
    }
}
