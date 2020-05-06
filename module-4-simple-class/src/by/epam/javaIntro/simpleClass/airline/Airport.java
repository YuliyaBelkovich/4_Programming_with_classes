package by.epam.javaIntro.simpleClass.airline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Airport {

    private Airline [] timetable;

    public Airport() throws FileNotFoundException {
        File timetable = new File("C:\\Users\\Asus\\IdeaProjects\\module-4-simple-class\\src\\by\\epam\\javaIntro\\simpleClass\\airline\\Timetable.txt");
        Scanner sc = new Scanner(timetable);

        int i = 0;
        this.timetable = new Airline[12];

        while(sc.hasNextLine()){
            String [] tmp = sc.nextLine().split(";");
            this.timetable[i] = new Airline(tmp[0],
                    Integer.parseInt(tmp[1]),
                    tmp[2],
                    Double.parseDouble(tmp[3]),
                    tmp[4]);
            i++;
        }
    }

    public void getAirlineByDestination(String destination){
        System.out.println("Flights to "+destination+":");
        for(Airline flight:timetable){
            if(flight.getDestination().equals(destination)){
                System.out.println(flight.toString());
            }
        }
    }

    public void getFlightsByWeekday(String weekday){
        System.out.println("Flights at "+weekday+":");
        for(Airline flight: timetable){
            if (flight.getWeekday().contains(weekday)){
                System.out.println(flight.toString());
            }
        }
    }
    public void getFlightsByWeekdayAndTime(String weekday, double time){
        System.out.println("Flights at "+weekday+":");
        for(Airline flight: timetable){
            if (flight.getWeekday().contains(weekday)&& flight.getDepartureTime()>time){
                System.out.println(flight.toString());
            }
        }
    }
}

