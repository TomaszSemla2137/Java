import java.util.Scanner;

class kalkulator {
    public static int dodawanie(int a, int b) {
        return a + b;
    }

    public static int odejmowanie(int a, int b) {
        return a - b;
    }

    public static int dzielenie(int a, int b) {
        int wynik=0;
        if (b==0){
             System.out.println("Co ty robisz człowieku? Czy cie pojebało?");
        }
        else {
            wynik=a / b;
        }
        return wynik;
    }

    public static int mnozenie(int a, int b) {
        return a * b;
    }

    public static long potegowanie(int a, int b) {
        if (b==0){
            return 1;
        }
        else {
            long wynik = a;
            for (long i = 1; i < b; i++) {
                wynik= wynik*a;
            }
            return wynik;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int y = scanner.nextInt();
        System.out.println("co chcesz z nimi zrobić?");
        System.out.println("0-dodawanie");
        System.out.println("1-odejmowanie");
        System.out.println("2-dzielenenie");
        System.out.println("3-mnozenie");
        System.out.println("4-potęgowanie");
        int wybor;
        wybor = scanner.nextInt();
        scanner.close();
        if (wybor == 0) {
            System.out.println(dodawanie(x, y));
        }
        else if (wybor == 1) {
            System.out.println(odejmowanie(x, y));
        }
        else if (wybor == 2) {
            System.out.println(dzielenie(x, y));
        }
        else if (wybor == 3) {
            System.out.println(mnozenie(x, y));
        }
       else if (wybor == 4) {
            System.out.println(potegowanie(x, y));
        } else {
            System.out.println("Ojojoj ty gagatku nie ta cyferka");
        }
    }
}