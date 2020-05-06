package by.epam.javaIntro.tour;

public class Tour {

    private String type;
    private int duration;
    private String typeOfNutrition;
    private String transport;
    private int price;

    public Tour(String type, int duration, String typeOfNutrition, String transport, int price) {
        this.type = type;
        this.duration = duration;
        this.typeOfNutrition = typeOfNutrition;
        this.transport = transport;
        this.price = price;
    }

    public String getType() {
        return type;
    }


    public int getDuration() {
        return duration;
    }


    public String getTypeOfNutrition() {
        return typeOfNutrition;
    }


    public String getTransport() {
        return transport;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tour " +
                "type = " + type +
                ", duration = " + duration +
                ", type of nutrition = " + typeOfNutrition +
                ", transport = " + transport +
                ", price = " + price +"\n";
    }
}
