package by.epam.javaIntro.car;

public class Car {

    /*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
    Методы: ехать, заправляться, менять колесо,
    вывести на консоль марку автомобиля.
     */

    private String carModel;
    private Wheel [] wheels;
    private Engine engine;

    public Car(String carModel) {
        this.carModel = carModel;
        this.wheels = Wheel.getFourWheel();
        this.engine = new Engine();
    }

    public int isWheelPumped(){
        boolean isBlowedUp = false;
        int index=0;
       for(int i =0; i<this.wheels.length;i++){
           if(!wheels[i].isPumppedUp()){
               isBlowedUp = true;
               index = i;
           }
       }
       if(isBlowedUp){
           return index;
       } else
       return -1;
    }

    public void move(){
        if(engine.isStarted() && engine.getFuelLevel()>0 && isWheelPumped()<0){
            System.out.println("The car started moving");
        }
        if (!engine.isStarted()) {
            engine.startTheEngine();
            System.out.println("The car started moving");
        }
        if(isWheelPumped()>0){
            System.out.println("Oops! Check the wheels, seems like one of them blowed up");
        }
    }

    public void showCarModel(){
        System.out.println(this.carModel);
    }

    public void refuel(int litres){
        this.engine.setFuelLevel(litres);
    }
}
