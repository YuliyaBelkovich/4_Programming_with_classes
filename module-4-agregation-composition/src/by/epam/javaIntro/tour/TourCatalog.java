package by.epam.javaIntro.tour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TourCatalog {

    private ArrayList<Tour> tourCatalog;
    private ArrayList<Tour> currentSuggestion;
    private File fileTour;

    {
          fileTour = new File("C:\\Users\\Asus\\IdeaProjects\\module-4-agregation-composition\\src\\by\\epam\\javaIntro\\tour\\TourCatalog.txt");
    }
    public TourCatalog() throws FileNotFoundException {

        Scanner sc = new Scanner(this.fileTour);
        tourCatalog = new ArrayList<>();
        currentSuggestion = new ArrayList<>();

        while(sc.hasNextLine()){

            String [] tmp = new String [5];
            tmp = sc.nextLine().split(",");

            Tour tour = new Tour(tmp[0],Integer.parseInt(tmp[1]),tmp[2],tmp[3],Integer.parseInt(tmp[4]));
            this.tourCatalog.add(tour);
            this.currentSuggestion.add(tour);
        }
    }

    public void suggestTourByType(String type){
        this.currentSuggestion.removeIf(e -> !e.getType().equals(type));
    }

    public void suggestTourByDuration(int duration){
        this.currentSuggestion.removeIf(e -> e.getDuration()!=duration);
    }

    public void suggestTourByTransport(String transport){
        this.currentSuggestion.removeIf(e->!e.getTransport().equals(transport));
    }

    @Override
    public String toString() {
        return "TourCatalog{" +
                ", currentSuggestion=" + currentSuggestion +
                '}';
    }

    public ArrayList<Tour> getCurrentSuggestion() {
        return currentSuggestion;
    }

    public void sortTourByPrice(ArrayList<Tour> tourCatalog){
        Collections.sort(tourCatalog,(o1,o2) ->o1.getPrice()-o2.getPrice());
    }
    public void sortTourByTransport(ArrayList<Tour> tourCatalog){
        Collections.sort(tourCatalog,(o1,o2) ->o1.getTransport().compareTo(o2.getTransport()));
    }
    public void sortTourByNutrition(ArrayList<Tour> tourCatalog){
        Collections.sort(tourCatalog,(o1,o2) ->o1.getTypeOfNutrition().compareTo(o2.getTypeOfNutrition()));
    }
    public void sortTourByDuration(ArrayList<Tour> tourCatalog){
        Collections.sort(tourCatalog,(o1,o2) ->o1.getDuration()-o2.getDuration());
    }


}
