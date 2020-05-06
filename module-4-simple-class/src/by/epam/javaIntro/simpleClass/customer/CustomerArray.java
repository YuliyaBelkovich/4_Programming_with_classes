package by.epam.javaIntro.simpleClass.customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerArray {

    private Customer[] customerArray;

    public CustomerArray() throws FileNotFoundException {
        File customerList = new File("C:\\Users\\Asus\\IdeaProjects\\module-4-simple-class\\src\\by\\epam\\javaIntro\\simpleClass\\customer\\CustomerList.txt");
        Scanner sc = new Scanner(customerList);
        int i = 0;
        this.customerArray = new Customer[5];

        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().split("\\s");

            this.customerArray[i] = new Customer(Integer.parseInt(tmp[0]),
                    tmp[1],
                    tmp[2],
                    tmp[3],
                    tmp[4],
                    Long.parseLong(tmp[5]));
            i++;
        }

    }

    public Customer[] getCustomerArray() {
        return customerArray;
    }

    public void getNumCreditCardIn(long min, long max) {
        System.out.println("Numbers of credit cards: ");

        for (Customer customer : this.customerArray) {
            if (customer.getNumCreditCard() > min && customer.getNumCreditCard() < max) {
                System.out.println(customer.getNumCreditCard());
            }
        }

    }

    public void sortInAlphabetic() {
        Arrays.sort(this.customerArray, Comparator.comparing(Customer::getFullName));
    }
}

