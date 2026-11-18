package lista4.zad5;

import java.util.HashSet;
import java.util.Set;

public class ATMService {
    private static final int[] DENOMINATIONS = {500, 200, 100, 50, 20, 10};
    private final int[] banknoteCounts = new int[DENOMINATIONS.length];

    public void deposit(int denomination, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity must not be negative.");
        }

        int index = denominationIndex(denomination);
        banknoteCounts[index] = Math.addExact(banknoteCounts[index], quantity);
    }

    public int withdraw(int amount) {
        if (amount <= 0 || amount % 10 != 0) {
            System.out.println("Nie można wypłacić: kwota musi być dodatnią wielokrotnością 10 zł.");
            return 0;
        }

        int[] notesToDispense = new int[DENOMINATIONS.length];
        Set<Long> failedStates = new HashSet<>();
        if (!findCombination(0, amount, notesToDispense, failedStates)) {
            System.out.println("Nie można wypłacić " + amount
                    + " zł: brak wystarczających środków lub odpowiednich nominałów.");
            return 0;
        }

        for (int i = 0; i < banknoteCounts.length; i++) {
            banknoteCounts[i] -= notesToDispense[i];
        }
        System.out.println("Wypłacono " + amount + " zł.");
        return amount;
    }

    public int getBanknoteCount(int denomination) {
        return banknoteCounts[denominationIndex(denomination)];
    }

    public long getAvailableAmount() {
        long amount = 0;
        for (int i = 0; i < DENOMINATIONS.length; i++) {
            amount += (long) DENOMINATIONS[i] * banknoteCounts[i];
        }
        return amount;
    }

    private boolean findCombination(int index, int remaining, int[] result, Set<Long> failedStates) {
        if (remaining == 0) {
            for (int i = index; i < result.length; i++) {
                result[i] = 0;
            }
            return true;
        }
        if (index == DENOMINATIONS.length) {
            return false;
        }

        long state = ((long) index << 32) | (remaining & 0xffffffffL);
        if (failedStates.contains(state)) {
            return false;
        }

        int denomination = DENOMINATIONS[index];
        int maxCount = Math.min(banknoteCounts[index], remaining / denomination);
        for (int count = maxCount; count >= 0; count--) {
            result[index] = count;
            if (findCombination(index + 1, remaining - count * denomination, result, failedStates)) {
                return true;
            }
        }

        result[index] = 0;
        failedStates.add(state);
        return false;
    }

    private int denominationIndex(int denomination) {
        for (int i = 0; i < DENOMINATIONS.length; i++) {
            if (DENOMINATIONS[i] == denomination) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unsupported banknote denomination: " + denomination);
    }
}
