package lista4.zad5;

public class Main {
    public static void main(String[] args) {
        ATMService atm = new ATMService();
        atm.deposit(500, 1);
        atm.deposit(200, 2);
        atm.deposit(100, 3);
        atm.deposit(50, 4);
        atm.deposit(20, 5);
        atm.deposit(10, 10);

        System.out.println("Środki w bankomacie: " + atm.getAvailableAmount() + " zł");
        atm.withdraw(780);
        atm.withdraw(35);
        atm.withdraw(1000);

        ATMService exactChangeAtm = new ATMService();
        exactChangeAtm.deposit(50, 1);
        exactChangeAtm.deposit(20, 3);
        exactChangeAtm.withdraw(60);
    }
}