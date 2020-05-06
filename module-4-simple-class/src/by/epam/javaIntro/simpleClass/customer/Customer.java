package by.epam.javaIntro.simpleClass.customer;

import java.io.FileNotFoundException;

public class Customer {

    /*Создать класс Customer, спецификация которого приведена ниже.
     * Определить конструкторы, set- и get- методы и метод toString().
     * Создать второй класс, агрегирующий массив типа Customer,
     * с подходящими конструкторами и методами.
     * Задать критерии выбора данных и вывести эти данные на консоль.
     */
    /*Класс Customer: id, фамилия, имя, отчество, адрес,
     * номер кредитной карточки, номер банковского счета.
     * Найти и вывести:
     * a) список покупателей в алфавитном порядке;
     * b) список покупателей, у которых номер кредитной карточки
     * находится в заданном интервале
     */

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String numBankAccount;
    private long numCreditCard;


    public Customer(int id, String surname, String name, String patronymic, String numBankAccount, long numCreditCard) {
        super();
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.numBankAccount = numBankAccount;
        this.numCreditCard = numCreditCard;
    }


    public int getId() {
        return id;
    }


    public String getNumBankAccount() {
        return numBankAccount;
    }


    public long getNumCreditCard() {
        return numCreditCard;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setNumBankAccount(String numBankAccount) {
        this.numBankAccount = numBankAccount;
    }


    public void setNumCreditCard(long numCreditCard) {
        this.numCreditCard = numCreditCard;
    }

    public String getFullName() {
        String fullName = this.surname + " " + this.name + " " + this.patronymic;
        return fullName;
    }

    public void setFullName(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }


    @Override
    public String toString() {
        return "Customer Id: " + id + ", surname: " + surname + ", name: " + name + ", patronymic: " + patronymic
                + ", bank account: " + numBankAccount + ", credit card: " + numCreditCard;
    }


    public static void main(String[] args) throws FileNotFoundException {
        CustomerArray customer = new CustomerArray();

        System.out.println(customer.getCustomerArray()[0].toString());

        customer.getNumCreditCardIn(0,4532733433140188L);

        customer.sortInAlphabetic();

        System.out.println(customer.getCustomerArray()[0].toString());

    }
}

