import java.util.Arrays;
import java.util.Scanner;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy początkowej: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];

        System.out.println("Podaj " + n + " elementów:");
        for (int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }

        System.out.print("Podaj element do wstawienia: ");
        int elem = scanner.nextInt();

        System.out.print("Podaj indeks wstawienia (od 0 do " + n + "): ");
        int index = scanner.nextInt();

        int[] wynik = wstawElement(tab, elem, index);
        System.out.println("Tablica po wstawieniu: " + Arrays.toString(wynik));

        scanner.close();
    }

    public static int[] wstawElement(int[] tab, int element, int index) {
        if (index < 0 || index > tab.length) {
            throw new IndexOutOfBoundsException("Niepoprawny indeks: " + index);
        }

        int[] result = new int[tab.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = tab[i];
        }

        result[index] = element;


        for (int i = index; i < tab.length; i++) {
            result[i + 1] = tab[i];
        }

        return result;
    }
