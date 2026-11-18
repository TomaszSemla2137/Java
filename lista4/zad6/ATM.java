package lista4.zad6;

public class ATM {
    private static final int[] DENOMINATIONS = {20, 50, 100, 200, 500};
    private final int[] banknotesCount = new int[DENOMINATIONS.length];

    public ATM() {
    }

    public void deposit(int[] banknotesCount) {
        if (banknotesCount == null || banknotesCount.length != DENOMINATIONS.length) {
            throw new IllegalArgumentException("Exactly five banknote counts are required.");
        }

        for (int count : banknotesCount) {
            if (count < 0) {
                throw new IllegalArgumentException("Banknote counts must not be negative.");
            }
        }

        for (int i = 0; i < this.banknotesCount.length; i++) {
            this.banknotesCount[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int remaining = amount;
        int[] dispensed = new int[DENOMINATIONS.length];

        for (int i = DENOMINATIONS.length - 1; i >= 0; i--) {
            dispensed[i] = Math.min(banknotesCount[i], remaining / DENOMINATIONS[i]);
            remaining -= dispensed[i] * DENOMINATIONS[i];
        }

        if (remaining != 0) {
            return new int[]{-1};
        }

        for (int i = 0; i < banknotesCount.length; i++) {
            banknotesCount[i] -= dispensed[i];
        }
        return dispensed;
    }
}
