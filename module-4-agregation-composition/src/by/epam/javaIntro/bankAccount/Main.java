package by.epam.javaIntro.bankAccount;

public class Main {
    public static void main(String[] args) {

        /*Счета. Клиент может иметь несколько счетов в банке.
        Учитывать возможность блокировки/разблокировки счета.
        Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
        Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
         */

        Client client = new Client("Kiyoko");
        client.getNewAccount(100);
        client.getNewAccount(300);
        client.getNumbersOfAccounts();
        client.getSumBalance();
        client.getSumPositiveBalance();
        client.replenishBalance(1,25);
        client.getBalanceOnAccount(1);
        client.withdrawMoney(1,150);
        client.getBalanceOnAccount(1);
        client.getSumNegativeBalance();
        client.searchAccountByBalance(0);
        client.sortAccountsByBalance();
        System.out.println(client.getAccounts().toString());
    }
}
