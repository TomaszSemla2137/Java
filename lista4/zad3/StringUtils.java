package lista4.zad3;

import java.util.Locale;

public class StringUtils {
    public Boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        String normalized1 = normalize(s1);
        String normalized2 = normalize(s2);

        if (normalized1.length() != normalized2.length()) {
            return false;
        }

        int[] characterCounts = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < normalized1.length(); i++) {
            characterCounts[normalized1.charAt(i)]++;
            characterCounts[normalized2.charAt(i)]--;
        }

        for (int count : characterCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    private String normalize(String value) {
        return value.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
    }
}