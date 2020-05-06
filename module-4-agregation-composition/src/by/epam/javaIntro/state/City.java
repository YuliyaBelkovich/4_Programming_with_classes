package by.epam.javaIntro.state;

public class City {

    private String name;
    private boolean isCapital;

    public City(String name, boolean isCapital) {
        this.name = name;
        this.isCapital = isCapital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public String getName() {
        return name;
    }

    public static City[] someCities(int numOfCities){
        City [] cities = new City[numOfCities];
        for(int i = 0; i < numOfCities;i++){
            cities[i] = new City("city"+(i+1),false);
        }
        return cities;
    }
}
