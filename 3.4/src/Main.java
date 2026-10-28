import java.util.Arrays;
import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        int[] inputTab = new int[n];

        System.out.println("Podaj " + n + " elementów:");
        for (int i = 0; i < n; i++) {
            inputTab[i] = scanner.nextInt();
        }

        int[] uniqueTab = usunDuplikaty(inputTab);
        System.out.println("Tablica bez duplikatów: " + Arrays.toString(uniqueTab));

        scanner.close();
    }

    public static int[] usunDuplikaty(int[] tab) {
        int[] temp = new int[tab.length];
        int uniqueCount = 0;

        for (int i = 0; i < tab.length; i++) {
            boolean isDuplicate = false;
            // Sprawdzamy, czy element był już zapisany w temp
            for (int j = 0; j < uniqueCount; j++) {
                if (tab[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = tab[i];
                uniqueCount++;
            }
        }

        // Przepisywanie do tablicy o dokładnym rozmiarze
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }