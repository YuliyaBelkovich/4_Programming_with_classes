package by.epam.javaIntro.simpleClass.airline;

import java.io.FileNotFoundException;

public class Airline {

    /*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
     */

    private String destination;
    private int flightNumber;
    private String planeType;
    private double departureTime;
    private String weekday;

    public Airline(String destination, int flightNumber, String planeType, double departureTime, String weekday) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.weekday = weekday;
    }

    public String getDestination() {
        return destination;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public String getWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", departureTime=" + departureTime +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {
        Airport timetable = new Airport();

        timetable.getAirlineByDestination("Tokyo");
        timetable.getFlightsByWeekday("wednesday");
        timetable.getFlightsByWeekdayAndTime("sunday",19.30);
    }
}
