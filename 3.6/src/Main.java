import java.util.Arrays;
import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar pierwszej tablicy: ");
        int n1 = scanner.nextInt();
        int[] tab1 = new int[n1];
        System.out.println("Podaj elementy pierwszej tablicy:");
        for (int i = 0; i < n1; i++) {
            tab1[i] = scanner.nextInt();
        }

        System.out.print("Podaj rozmiar drugiej tablicy: ");
        int n2 = scanner.nextInt();
        int[] tab2 = new int[n2];
        System.out.println("Podaj elementy drugiej tablicy:");
        for (int i = 0; i < n2; i++) {
            tab2[i] = scanner.nextInt();
        }

        sortowanieBabelkowe(tab1);
        sortowanieBabelkowe(tab2);

        System.out.println("Posortowana tablica 1: " + Arrays.toString(tab1));
        System.out.println("Posortowana tablica 2: " + Arrays.toString(tab2));

        scanner.close();
    }

    public static void sortowanieBabelkowe(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
