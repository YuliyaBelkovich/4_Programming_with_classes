package by.epam.javaIntro.simpleClass;

public class Counter {

    /*Опишите класс, реализующий десятичный счетчик,
     * который может увеличивать или уменьшать свое значение на единицу
     * в заданном диапазоне.
     * Предусмотрите инициализацию счетчика значениями по умолчанию и
     * произвольными значениями.
     * Счетчик имеет методы увеличения и уменьшения состояния,
     * и метод позволяющее получить его текущее состояние.
     * Написать код, демонстрирующий все возможности класса.
     */

    private int min;
    private int max;
    private int count;

    public Counter() {
        this.min = 0;
        this.max = 1000;
        this.count = 0;
    }


    public int getMin() {
        return min;
    }


    public int getMax() {
        return max;
    }


    public int getCount() {
        return count;
    }


    public void setMin(int min) {
        this.min = min;
    }


    public void setMax(int max) {
        this.max = max;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public void increase() {
        if(this.count<this.getMax()) {
            this.count++;
        } else {
            System.out.println("Counter reached maximum value, impossible to increase ");
        }
    }

    public void reduce() {
        if(this.count>this.getMin()) {
            this.count--;
        } else {
            System.out.println("Counter reached minimum value, impossible to reduce");
        }
    }

    public void getCurrentCondition() {
        System.out.println("Current condition: "+this.count);
    }

    public static void main(String [] args) {

        Counter counter = new Counter();

        counter.getCurrentCondition();
        counter.increase();
        counter.getCurrentCondition();
        counter.reduce();
        counter.getCurrentCondition();
    }

}

