package by.epam.javaIntro.car;

public class Wheel {

    private boolean isPumppedUp;

    public Wheel(boolean isPumppedUp) {
        this.isPumppedUp = isPumppedUp;
    }

    public boolean isPumppedUp() {
        return isPumppedUp;
    }

    public static Wheel[] getFourWheel(){
        Wheel[] wheels = new Wheel[4];
        for(int i = 0; i<wheels.length;i++){
            wheels[i] = new Wheel(true);
        }
        return wheels;
    }
}
