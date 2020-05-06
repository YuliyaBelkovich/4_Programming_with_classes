package by.epam.javaIntro.state;

public class State {

    /*Создать объект класса Государство, используя классы Область, Район, Город.
    Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
     */

    private String name;

    private Region [] regions;
    private City capital;
    private int area;

    public State(String name, String capital, int numRegions){
        this.name = name;
        this.regions = Region.someRegions(numRegions);
        this.capital = new City(capital, true);
        this.area = (int) (Math.random()*100+1)*numRegions;
    }

    public void stateCapital(){
        System.out.println(this.capital.getName()+" is the capital of "+this.name);
    }
    public void numRegions(){
        System.out.println("Number of regions: "+ this.regions.length);
    }

    public void area(){
        System.out.println("Total area: "+this.area+" square km");
    }

    public void regionsCapitals(){
        System.out.println("Capitals of regions:");
        for(Region region: regions){
            System.out.println(region.getCapital().getName()+" - "+region.getName());
        }
    }
}
