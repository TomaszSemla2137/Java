import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę dni (rozmiar tablicy ceny): ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Podaj ceny akcji dla kolejnych dni:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int profit = maxProfit(prices);
        System.out.println("Maksymalny zysk: " + profit);

        scanner.close();
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }