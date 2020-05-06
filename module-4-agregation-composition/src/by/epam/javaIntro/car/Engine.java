package by.epam.javaIntro.car;

public class Engine {

    private boolean isStarted;
    private int fuelLevel;

    public Engine(){
       this.isStarted = false;
       this.fuelLevel = 0;
    }

    public void startTheEngine(){
        if(this.fuelLevel>0) {
            this.isStarted = true;
        } else{
            System.out.println("Can't start, the fuel tank is empty. Refuel");
        }
    }

    public int getFuelLevel(){
        return this.fuelLevel;
    }


    public boolean isStarted() {
        return isStarted;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
