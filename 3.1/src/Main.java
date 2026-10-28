import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
        int sum=0;
        scanner.close();
        for (int i = 0; i < tab.length; i++) {
            sum+=tab[i];
        }
        for (int number : tab) {
            System.out.println(number);
        }
        System.out.println("Suma tych liczb to:"+sum);
    }
}