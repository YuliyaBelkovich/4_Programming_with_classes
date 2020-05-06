package by.epam.javaIntro.simpleClass;

public class Test2 {

    /*Создйте класс Test2 двумя переменными.
     * Добавьте конструктор с входными параметрами.
     * Добавьте конструктор, инициализирующий члены класса по умолчанию.
     * Добавьте set- и get- методы для полей экземпляра класса.
     */

    private int a;
    private int b;

    public Test2(int valueOfA, int valueOfB) {
        this.a = valueOfA;
        this.b = valueOfB;
    }

    public Test2() {
        this.a = 0;
        this.b = 0;
    }

    public void setA(int value) {
        this.a = value;
    }

    public void setB(int value) {
        this.b = value;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
}

