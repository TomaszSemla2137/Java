import java.util.Scanner;
class przelicznik {
    public static int l_na_m(int a) {
        return a*12;
    }
    public static int m_na_d(int x) {
        return x*30;
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj swoje imie: ");
    String imie = scanner.nextLine();
    System.out.println("Podaj swój rok urodzenia: ");
    int rok = scanner.nextInt();
    System.out.println("Podaj swój miesiąc urodzenia(liczba): ");
    int miesiac = scanner.nextInt();
    scanner.close();
    int dzis_r = 2026;
    int dzis_m = 10;
    int dni_dzis = 0;
    int dni_twoje = 0;
    dni_dzis = m_na_d(l_na_m(dzis_r - 1) + dzis_m);
    dni_twoje = m_na_d(l_na_m(rok - 1) + miesiac);
    int minelo = dni_dzis - dni_twoje;
    System.out.println("Nazywasz się" + imie + " a od twoich narodzin minęło: " + minelo + " dni");

}
}
