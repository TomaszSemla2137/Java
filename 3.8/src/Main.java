import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int rows = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Podaj elementy macierzy:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMacierz pierwotna:");
        wypiszMacierz(matrix);

        int[][] transposed = transponuj(matrix);

        System.out.println("\nMacierz po transpozycji:");
        wypiszMacierz(transposed);

        scanner.close();
    }

    public static int[][] transponuj(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    private static void wypiszMacierz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }