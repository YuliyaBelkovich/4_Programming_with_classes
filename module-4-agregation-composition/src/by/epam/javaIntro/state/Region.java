package by.epam.javaIntro.state;

import java.util.Arrays;

public class Region {
    private String name;

    private City capital;
    private City[] cities;

    public Region(String name, String capitalName, City... cities) {
        this.name = name;
        this.capital = new City(capitalName, true);
        this.cities = cities;
    }

    public City getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Region{" +
                "capital=" + capital +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }

    public static Region[] someRegions(int numRegions) {
        Region [] regions = new Region [numRegions];
        for(int i = 0; i< numRegions; i++){
            regions[i] = new Region("region"+(i+1),"region"+(i+1)+" capital",City.someCities(numRegions));
        }
        return regions;
    }

    public String getName() {
        return name;
    }
}
