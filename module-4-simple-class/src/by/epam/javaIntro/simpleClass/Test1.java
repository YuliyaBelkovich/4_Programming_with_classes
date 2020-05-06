package by.epam.javaIntro.simpleClass;

public class Test1 {

    /*Создайте класс Test1 двумя переменными.
     * Добавьте метод вывода на экран и методы изменения этих переменных.
     * Добавьте метод, который находит сумму значений этих переменных,
     * и метод, который находит наибольшее значение из этих двух переменных.
     */

    private int a;
    private int b;

    public void showA() {
        System.out.println(this.a);
    }

    public void showB() {
        System.out.println(this.b);
    }

    public void changeA(int newValue) {
        this.a = newValue;
    }

    public void changeB(int newValue) {
        this.b = newValue;
    }

    public int sum() {
        int sum;
        return  sum = this.a+this.b;
    }

    public int max() {
        int max = Math.max(this.a, this.b);
        return max;
    }
}