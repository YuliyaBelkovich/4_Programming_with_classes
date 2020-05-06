package by.epam.javaIntro.simpleClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train  implements Comparator{

    /*Создайте класс Train, содержащий поля:
     * название пункта назначения,
     * номер поезда,
     * время отправления.
     * Создайте данные в массив из пяти элементов типа Train,
     * добавьте возможность сортировки элементов массива
     * по номерам поездов.
     * Добавьте возможность вывода информации о поезде,
     * номер которого введен пользователем.
     * Добавьте возможность сортировки массив по пункту назначения,
     * причем поезда с одинаковыми пунктами назначения
     * должны быть упорядочены по времени отправления.
     */

    private String destination;
    private int numTrain;
    private double timeDeparture;

    public Train(String destination, int numTrain, double timeDeparture) {
        this.destination = destination;
        this.numTrain = numTrain;
        this.timeDeparture = timeDeparture;
    }

    @Override
    public String toString() {
        return "Train [destination=" + destination + ", numTrain=" + numTrain + ", timeDeparture=" + timeDeparture
                + "]";
    }


    public static void sortByNum(Train [] train) {
        Arrays.sort(train,(o1,o2)->o1.numTrain-o2.numTrain);
    }

    public static void infoTrain(int numTrain, Train [] train) {
        for(Train element: train) {
            if (element.numTrain==numTrain) {
                System.out.println(element.toString());
            }
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static Comparator <Train> DestinationComparator = new Comparator<Train>() {

        @Override
        public int compare(Train t1, Train t2) {
            if (t1.destination.compareTo(t2.destination)==0){
                return (int) (t1.timeDeparture-t2.timeDeparture);
            } else {
                return t1.destination.compareTo(t2.destination);
            }
        }
    };


    public static void sortByDestination(Train [] train) {
        Arrays.sort(train,DestinationComparator);
    }


    public static void main(String[]args) {

        Train[] train = new Train[5];

        train[0] = new Train("Osaka",1234,12.15);
        train[1] = new Train("Osaka",1438,13.45);
        train[2] = new Train("Tokyo",1744,8.15);
        train[3] = new Train("Iokogama",1253,14.30);
        train[4] = new Train("Nagoya",1114,10.00);

        System.out.println("Sorted by numbers:");
        Train.sortByNum(train);

        for(Train element: train) {
            System.out.println(element.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of train: ");
        int numTrain = sc.nextInt();
        Train.infoTrain(numTrain, train);

        System.out.println("Sorted by the destination point: ");
        Train.sortByDestination(train);

        for(Train element: train) {
            System.out.println(element.toString());
        }

    }
}

