import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wymiar N dla macierzy kwadratowych (N x N): ");
        int n = scanner.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        System.out.println("Wprowadź elementy macierzy A:");
        wczytajMacierz(scanner, A);

        System.out.println("Wprowadź elementy macierzy B:");
        wczytajMacierz(scanner, B);

        int[][] C = pomnozMacierze(A, B);

        System.out.println("Wynik mnożenia A * B:");
        wypiszMacierz(C);

        scanner.close();
    }

    public static int[][] pomnozMacierze(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    private static void wczytajMacierz(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void wypiszMacierz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }