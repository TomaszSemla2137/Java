import java.util.Scanner;
public static void main(String[] args) {
    boolean czy_potega_dwojki;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę N");
    int n = scanner.nextInt();
    scanner.close();
    int temp=n;
    while (temp % 2 == 0) {
        temp /= 2;
    }
    if (temp == 1) {
        czy_potega_dwojki = true;
    }
    else {
    czy_potega_dwojki=false;
    }
    if (czy_potega_dwojki==true) {
        System.out.println("Liczba: " + n + " jest potęgą dwójki");
    }
    else {
        System.out.println("Liczba: " + n + " nie jest potęgą dwójki");
    }
    }

